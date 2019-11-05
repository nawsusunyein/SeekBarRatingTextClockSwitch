package com.example.seekratingclockswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        final RatingBar rtBar = (RatingBar) findViewById(R.id.ratingBar);
        Button btnGetRating = (Button) findViewById(R.id.btnGetRating);
        final TextView txtRating = (TextView) findViewById(R.id.txtRatingNumber);

        btnGetRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numOfStars = rtBar.getNumStars();
                float rateCount = rtBar.getRating();
                txtRating.setText("Rating is : " + rateCount + "/" + numOfStars);
            }
        });
    }
}
