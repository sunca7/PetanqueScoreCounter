package com.android.sunah.petanquescorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0 ;
    int scoreTeamB = 0 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText)findViewById(R.id.editText1);
        EditText editText2= (EditText)findViewById(R.id.editText2);
        EditText editText3= (EditText)findViewById(R.id.editText3);
        EditText editText4= (EditText)findViewById(R.id.editText4);
        EditText editText5= (EditText)findViewById(R.id.editText5);
        EditText editText6= (EditText)findViewById(R.id.editText6);
        EditText editText7= (EditText)findViewById(R.id.editText7);
        EditText editText8= (EditText)findViewById(R.id.editText8);
        EditText editText9= (EditText)findViewById(R.id.editText9);
        EditText editText10= (EditText)findViewById(R.id.editText10);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1 ;
        displayForTeamA(scoreTeamA) ;
    }

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1 ;
        displayForTeamB(scoreTeamB) ;
    }
    public void minusOneForTeamA(View v) {
        scoreTeamA = scoreTeamA - 1 ;
        displayForTeamA(scoreTeamA) ;
    }

    public void minusOneForTeamB(View v) {
        scoreTeamB = scoreTeamB - 1 ;
        displayForTeamB(scoreTeamB) ;
    }



    public void resetScore(View v) {
        scoreTeamA = 0 ;
        scoreTeamB = 0 ;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
