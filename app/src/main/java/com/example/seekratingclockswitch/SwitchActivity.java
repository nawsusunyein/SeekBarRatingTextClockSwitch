package com.example.seekratingclockswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        final Switch sw1 = (Switch) findViewById(R.id.switch1);
        final Switch sw2 = (Switch) findViewById(R.id.switch2);
        Button btnGet = (Button) findViewById(R.id.btnGet);

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = "", str2 = "";
                if(sw1.isChecked()){
                    str1 = sw1.getTextOn().toString();
                }else{
                    str1 = sw1.getTextOff().toString();
                }

                if(sw2.isChecked()){
                    str2 = sw2.getTextOn().toString();
                }else{
                    str2 = sw2.getTextOff().toString();
                }

                String result = "Switch One : " + str1 + "\n Switch Two : " + str2;
                Toast.makeText(SwitchActivity.this,result,Toast.LENGTH_LONG).show();
            }
        });
    }
}
