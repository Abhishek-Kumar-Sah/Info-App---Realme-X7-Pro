package com.avi.in.spex_realmex7pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class camera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
    }

    public void cameraBackView(View view) {
        Intent displayView = new Intent(this,Display.class);
        startActivity(displayView);
    }

    public void cameraNextView(View view) {


        Intent batteryView = new Intent(this,battery.class);
        startActivity(batteryView);
    }
}