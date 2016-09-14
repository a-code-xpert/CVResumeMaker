package com.blogspot.toppersdaily.technosolz.cvresumemaker.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.blogspot.toppersdaily.technosolz.cvresumemaker.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void invite_friends(View v) {

    }

    public void goto_facebook(View v) {

    }

    public void goto_twitter(View v) {

    }

    public void share_app(View v) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Hey!! Check out this awesome app for creating CVs in PDF. You can create a Resume for yourself really easily and save it as PDF to use it for your next job.";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "CV Resume Maker Application");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }

    public void send_feedback(View v) {

    }
}
