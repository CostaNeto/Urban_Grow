package com.example.urbangrow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Open Course page
        Button courseBtn = (Button) findViewById(R.id.watchedVideosBtn);
        courseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCoursePage();
            }
        });

        // Open Bundle page
        Button bundleBtn = (Button) findViewById(R.id.wishListBtn);
        bundleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBundlePage();
            }
        });

        // Open See also page
        Button seeAlsoBtn = (Button) findViewById(R.id.communityBtn);
        seeAlsoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSeeAlsoPage();
            }
        });

        // Open Me Page
        ImageButton meBtn = (ImageButton) findViewById(R.id.meBtn);
        meBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMePage();
            }
        });

    }

    // Course Page
    public void openCoursePage() {
        Intent openCourses = new Intent(this, CoursePage.class);
        startActivity(openCourses);
    }

    // Bundle Page
    public void openBundlePage() {
        Intent openBundles = new Intent(this, BundlePage.class);
        startActivity(openBundles);
    }

    // See Also Page
    public void openSeeAlsoPage() {
        Intent openSeeAlso = new Intent(this, SeeAlsoPage.class);
        startActivity(openSeeAlso);
    }

    // Me Page
    public void openMePage() {
        Intent openMe = new Intent(this, MePage.class);
        startActivity(openMe);
    }
}