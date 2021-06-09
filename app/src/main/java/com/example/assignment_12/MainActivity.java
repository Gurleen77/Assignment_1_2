package com.example.assignment_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView computerDie, playerDie, result;
    TextView computerScore, PlayerScore;
    Button Lower, Higher;
    int compScore = 0;
    int playScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        computerDie = findViewById(R.id.ComputerDice);
        playerDie = findViewById(R.id.PlayerDice);
        result = findViewById(R.id.Result);
        computerScore = findViewById(R.id.CompScore);
        PlayerScore = findViewById(R.id.PlayScore);
        Lower = findViewById(R.id.Lower);
        Higher = findViewById(R.id.Higher);

        int[] DiceArray =  {R.drawable.dice1,
                            R.drawable.dice2, R.drawable.dice3,
                            R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        computerScore.setText("Score: " + compScore);
        PlayerScore.setText("Score: " + playScore);

        result.setVisibility(View.INVISIBLE);

        Lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int compDie = rand.nextInt(6);
                int playDie = rand.nextInt(6);
                computerDie.setImageResource(DiceArray[compDie]);
                playerDie.setImageResource(DiceArray[playDie]);
                if(compDie < playDie){
                    compScore +=10;
                    computerScore.setText("Score: " + compScore);
                    PlayerScore.setText("Score: " + playScore);
                    result.setVisibility(View.VISIBLE);
                    result.setImageResource(R.drawable.computer_winner);
                }else if(compDie == playDie){
                    computerScore.setText("Score: " + compScore);
                    PlayerScore.setText("Score: " + playScore);
                    result.setVisibility(View.VISIBLE);
                    result.setImageResource(R.drawable.geme_tie);
                }else{
                    playScore +=10;
                    computerScore.setText("Score: " + compScore);
                    PlayerScore.setText("Score: " + playScore);
                    result.setVisibility(View.VISIBLE);
                    result.setImageResource(R.drawable.player_winner);
                }
            }
        });

        Higher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int compDie = rand.nextInt(6);
                int playDie = rand.nextInt(6);
                computerDie.setImageResource(DiceArray[compDie]);
                playerDie.setImageResource(DiceArray[playDie]);
                if(compDie > playDie){
                    compScore +=10;
                    computerScore.setText("Score: " + compScore);
                    PlayerScore.setText("Score: " + playScore);
                    result.setVisibility(View.VISIBLE);
                    result.setImageResource(R.drawable.computer_winner);
                }else if(compDie == playDie){
                    computerScore.setText("Score: " + compScore);
                    PlayerScore.setText("Score: " + playScore);
                    result.setVisibility(View.VISIBLE);
                    result.setImageResource(R.drawable.geme_tie);
                }else{
                    playScore +=10;
                    computerScore.setText("Score: " + compScore);
                    PlayerScore.setText("Score: " + playScore);
                    result.setVisibility(View.VISIBLE);
                    result.setImageResource(R.drawable.player_winner);
                }
            }
        });
    }
}