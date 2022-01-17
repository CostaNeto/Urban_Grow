package com.example.urbangrow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CoursePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

        // Open Video #1
        Button courseOneBtn = (Button) findViewById(R.id.watchedVideosBtn);
        courseOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                String courseOne = "https://www.youtube.com/watch?v=pbXk_bQornM";
                Uri webAddress = Uri.parse(courseOne);

                Intent goToCourseOne = new Intent(Intent.ACTION_VIEW, webAddress);
                if (goToCourseOne.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToCourseOne);
                }
            }
        });

        // Open Video #2
        Button courseTwoBtn = (Button) findViewById(R.id.courseTwoBtn);
        courseTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                String courseTwo = "https://www.youtube.com/watch?v=ianApRDflh0";
                Uri webAddress = Uri.parse(courseTwo);

                Intent goToCourseTwo = new Intent(Intent.ACTION_VIEW, webAddress);
                if (goToCourseTwo.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToCourseTwo);
                }
            }
        });

        // Go back to home page
        ImageButton returnHomePageBtn = (ImageButton) findViewById(R.id.returnToMePage);
        returnHomePageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomePage();
            }
        });

    }

    public void openHomePage() {
        Intent openHome = new Intent(this, MainActivity.class);
        startActivity(openHome);
    }

}