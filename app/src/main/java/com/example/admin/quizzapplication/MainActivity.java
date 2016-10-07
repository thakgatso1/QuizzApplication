package com.example.admin.quizzapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openScrum(View view) {
        Intent intent = new Intent(MainActivity.this, Scrum.class);
        startActivity(intent);
    }

    public void openAndroid(View view) {
        Intent intent = new Intent(MainActivity.this, Android.class);
        startActivity(intent);
    }

    public void openPolitics(View view) {

        Intent intent = new Intent(MainActivity.this, SouthAfricanPolitics.class);

        startActivity(intent);

    }


    public void exit(View v) {
        onBackPressed();
    }



    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
