package com.example.urbangrow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BundlePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_page);

        ImageButton returnToHomePageBtn = (ImageButton) findViewById(R.id.returnToHomePage);
        returnToHomePageBtn.setOnClickListener(new View.OnClickListener() {
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