package com.example.nurmuhammadluthfi.luthficreativeprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    private ImageButton mBtLaunchActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtLaunchActivity = (ImageButton) findViewById(R.id.below_bttn);

        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });
    }


    public  void launchActivity() {
        Intent myIntent = new Intent(this, AboutMe.class);
        startActivity(myIntent);
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }
}
