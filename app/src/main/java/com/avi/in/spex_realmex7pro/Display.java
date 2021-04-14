package com.avi.in.spex_realmex7pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    }

    public void displayBackView(View view) {
        Intent processor = new Intent(this,Processor.class);
        startActivity(processor);
    }

    public void displayNextView(View view) {
        Intent cameraView = new Intent(this,camera.class);
        startActivity(cameraView);
    }
}