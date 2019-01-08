package com.example.android.cricketcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int runIndia = 0;
    int runAustralia = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Code for India
    public void sixRunIndia(View v){
        runIndia = runIndia + 6;
        displayforIndia(runIndia);
    }
    public void fourRunIndia(View v){
        runIndia = runIndia + 4;
        displayforIndia(runIndia);
    }
    public void doubleRunIndia(View v){
        runIndia = runIndia + 2;
        displayforIndia(runIndia);
    }
    public void singleRunIndia(View v){
        runIndia = runIndia + 1;
        displayforIndia(runIndia);
    }
    public void displayforIndia(int run) {
        TextView runView = (TextView) findViewById(R.id.score_of_india);
        runView.setText(String.valueOf(run));
    }

    //Code for Australia
    public void sixRunAustralia(View v){
        runAustralia = runAustralia + 6;
        displayforAustralia(runAustralia);
    }
    public void fourRunAustralia(View v){
        runAustralia = runAustralia + 4;
        displayforAustralia(runAustralia);
    }
    public void doubleRunAustralia(View v){
        runAustralia = runAustralia + 2;
        displayforAustralia(runAustralia);
    }
    public void singleRunAustralia(View v){
        runAustralia = runAustralia + 1;
        displayforAustralia(runAustralia);
    }
    public void displayforAustralia(int run) {
        TextView runView = (TextView) findViewById(R.id.score_of_australia);
        runView.setText(String.valueOf(run));
    }
    public void resetRun(View v){
        runIndia = 0;
        runAustralia = 0;
        displayforIndia(runIndia);
        displayforAustralia(runAustralia);
    }
}


