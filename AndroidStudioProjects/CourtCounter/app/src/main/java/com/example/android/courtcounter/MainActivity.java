package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Keeps track of Team A's score
    int scoreTeamA = 0;

    //Keeps track of Team B's score
    int scoreTeamB = 0;

    public void addFreeThrowToA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoPointsToA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addThreePointsToA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void clearScoreA(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
    }

    public void addFreeThrowToB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoPointsToB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreePointsToB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void clearScoreB(View view) {
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }

    public void clearScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
