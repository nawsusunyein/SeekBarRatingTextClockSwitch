package com.example.seekratingclockswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSeekBarActivity(View view){
        Intent seekbarIntent = new Intent(MainActivity.this,SeekBarActivity.class);
        startActivity(seekbarIntent);
    }

    public void goToRatingBarActivity(View view){
        Intent ratingBarIntent = new Intent(MainActivity.this,RatingBarActivity.class);
        startActivity(ratingBarIntent);
    }

    public void goToSwitchActivity(View view){
        Intent switchIntent = new Intent(MainActivity.this,SwitchActivity.class);
        startActivity(switchIntent);
    }

    public void goToTextClockActivity(View view){
        Intent textClockIntent = new Intent(MainActivity.this,TextClockActivity.class);
        startActivity(textClockIntent);
    }

    public void goToAlertDialogActivity(View view){
        Intent alertDialogIntent = new Intent(MainActivity.this,AlertDialogActivity.class);
        startActivity(alertDialogIntent);
    }
}
