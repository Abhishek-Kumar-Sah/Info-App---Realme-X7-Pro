package com.avi.in.spex_realmex7pro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Toast;

public class WelcomeScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);



        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                showReceiverToast(intent);

            }

        };

        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_SCREEN_ON);
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);


        this.registerReceiver(broadcastReceiver,filter);


    }
    private void showReceiverToast(Intent intent) {

        Toast.makeText(this, "Received A Broadcast : "+ intent.getAction(), Toast.LENGTH_SHORT).show();

    }



    public void welcomeView(View view) {

        Toast.makeText(this, "Welcome To Spec Review Of Realme X7 Pro 5G", Toast.LENGTH_SHORT).show();
        Intent overView = new Intent(this,MainActivity.class);
        startActivity(overView);
    }
}