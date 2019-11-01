package com.example.seekratingclockswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class TextClockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_clock);
        final TextClock textClock = (TextClock) findViewById(R.id.textClock1);
        Button btnGetTime = (Button) findViewById(R.id.btnGet);
        final TextView txtTime = (TextView) findViewById(R.id.txtTime);

        btnGetTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTime.setText(textClock.getText());
            }
        });
    }
}
