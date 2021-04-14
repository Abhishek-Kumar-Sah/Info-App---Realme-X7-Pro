package com.avi.in.spex_realmex7pro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.TimeZoneNames;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class battery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);
    }

    public void batteryBackView(View view) {
        Intent cameraView = new Intent(this,camera.class);
        startActivity(cameraView);
    }

    public void batteryToWelcomeView(View view) {
        Intent welcomeView = new Intent(this,WelcomeScreen.class);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Restart Tour ?");
        builder.setMessage("Would You Like To Restart The Tour OR Exit The App ");
        builder.setCancelable(true);
        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                finishAffinity();
                System.exit(0);

            }
        });
        builder.setPositiveButton("Restart", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                startActivity(welcomeView);

            }
        });
        AlertDialog alertDialog;
        alertDialog = builder.create();
        alertDialog.show();


    }
}