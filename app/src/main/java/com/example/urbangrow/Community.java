package com.example.urbangrow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Community extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        ImageButton returnToMePage = (ImageButton) findViewById(R.id.returnToMePage);
        returnToMePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMePage();
            }
        });
    }

    public void openMePage() {
        Intent openMe = new Intent(this, MePage.class);
        startActivity(openMe);
    }
}