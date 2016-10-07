package com.example.admin.quizzapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Scrum extends AppCompatActivity {
    private String[] arraySpinner1;
    private String[] arraySpinner2;
    private String[] arraySpinner3;
    private String[] arraySpinner4;
    private String[] arraySpinner5;
    private Spinner s,s1,s2,s3,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrum);
        this.arraySpinner1 = new String[] {

                "scrum_master", "project_manager", "production_team"
        };
        this.arraySpinner2 = new String[] {
                "commitment", "focus", "encouragement"
        };
        this.arraySpinner3 = new String[] {

                "4 weeks", "28-30 days", "Anything between 2 - 6 weeks", "30 days"
        };
        this.arraySpinner4 = new String[] {

                "Product review meeting", "Sprint review meeting", "Sprint planning meeting", "Sprint retrospective meeting"
        };
        this.arraySpinner5 = new String[] {

                "Product Backlog", "Story", "Sprint Backlog"
        };
        s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner1);
        s.setAdapter(adapter);


        s1 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner2);
        s1.setAdapter(adapter1);

        s2 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner3);
        s2.setAdapter(adapter2);

        s3 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner4);
        s3.setAdapter(adapter3);

        s4 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner5);
        s4.setAdapter(adapter4);

    }


    public void buttonBack(View view){
        Intent intent=new Intent(Scrum.this,MainActivity.class);
        startActivity(intent);
    }

    public void calcTotal() {
        int totScore = 0;

        String lowMark,highMark,message="";


        if (s.getSelectedItem().toString().equalsIgnoreCase("project_manager")) {

            totScore ++;

        }
        if (s1.getSelectedItem().toString().equalsIgnoreCase("encouragement")) {
            totScore ++;

        }
        if (s2.getSelectedItem().toString().equalsIgnoreCase("30 days")) {

            totScore ++;

        }
        if (s3.getSelectedItem().toString().equalsIgnoreCase("product review meeting")) {

            totScore ++;

        }
        if (s4.getSelectedItem().toString().equalsIgnoreCase("story")) {

            totScore ++;

        }



        if(totScore<=3){
            lowMark="you have scored a low mark...\n" +
                    "please  press back to try again!";
            message="your score is :"+ totScore +" \n "+lowMark;
        }else if(totScore>=4) {
            highMark="Well done!!!  \n press back to try another category";
            message="your score is :"+ totScore +" \n" + highMark;
        }
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();;
    }


    public void display(View v){
        calcTotal();

    }
    }
