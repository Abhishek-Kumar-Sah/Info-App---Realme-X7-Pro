package com.avi.in.spex_realmex7pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Processor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processor);
    }

    public void processorBackView(View view) {

        Intent overView = new Intent(this,MainActivity.class);
        startActivity(overView);
    }

    public void processorNextView(View view) {

        Intent displayView = new Intent(this,Display.class);
        startActivity(displayView);
    }
}