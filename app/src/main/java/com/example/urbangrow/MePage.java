package com.example.urbangrow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_page);

        // Open watched videos
        Button watchedVideosBtn = (Button) findViewById(R.id.watchedVideosBtn);
        watchedVideosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWatchedVideosPage();
            }
        });

        // Open Wishlist
        Button wishListBtn = (Button) findViewById(R.id.wishListBtn);
        wishListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWishlistPage();
            }
        });

        // Open community
        Button communityBtn = (Button) findViewById(R.id.communityBtn);
        communityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCommunityPage();
            }
        });

        // Open home page
        ImageButton HomePageBtn = (ImageButton) findViewById(R.id.returnToMePage);
        HomePageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomePage();
            }
        });

    }


    public void openWatchedVideosPage() {
        Intent openWatchedVideos = new Intent(this, WatchedVideos.class);
        startActivity(openWatchedVideos);
    }

    public void openWishlistPage() {
        Intent openWish_list = new Intent(this, Wishlist.class);
        startActivity(openWish_list);
    }

    public void openCommunityPage() {
        Intent openCommunity = new Intent(this, Community.class);
        startActivity(openCommunity);
    }

    public void openHomePage() {
        Intent openHome = new Intent(this, MainActivity.class);
        startActivity(openHome);
    }

}