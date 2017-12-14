package tech.geeksquad.scoreapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView score1View;
    private TextView score2View;
    private int score1 = 0;
    private int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score1View = findViewById(R.id.score1);
        score2View = findViewById(R.id.score2);
    }

    private void updateScores() {
        score1View.setText(String.valueOf(score1));
        score2View.setText(String.valueOf(score2));
    }

    public void one1(View view) {
        score1++;
        updateScores();
    }

    public void two1(View view) {
        score1 += 2;
        updateScores();
    }

    public void three1(View view) {
        score1 += 3;
        updateScores();
    }

    public void four1(View view) {
        score1 += 4;
        updateScores();
    }

    public void six1(View view) {
        score1 += 6;
        updateScores();
    }

    public void one2(View view) {
        score2++;
        updateScores();
    }

    public void two2(View view) {
        score2 += 2;
        updateScores();
    }

    public void three2(View view) {
        score2 += 3;
        updateScores();
    }

    public void four2(View view) {
        score2 += 4;
        updateScores();
    }

    public void six2(View view) {
        score2 += 6;
        updateScores();
    }
}
