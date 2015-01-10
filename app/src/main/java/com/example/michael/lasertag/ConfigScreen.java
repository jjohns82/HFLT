package com.example.michael.lasertag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class ConfigScreen extends Activity {
    private static int gameLen;
    private static int numPlayers;
    private static int vests[];

    public void gameModePressed(View view) {
        Intent intent = new Intent(this, GameMode.class);
        this.startActivityForResult(intent, Constants.GAME_MODE_REQ);
        overridePendingTransition (R.anim.right_slide_in, R.anim.right_slide_out);
    }
    public void numPlayersPressed(View view) {
        Intent intent = new Intent(this, NumPlayers.class);
        this.startActivityForResult(intent, Constants.NUM_PLAYERS_REQ);
        overridePendingTransition (R.anim.right_slide_in, R.anim.right_slide_out);
    }
    public void playerAssignmentPressed(View view) {
        Intent intent = new Intent(this, PlayerAssignment.class);
        Bundle b = new Bundle();
        b.putIntArray("vests", vests);
        b.putInt("numPlayers", numPlayers);
        intent.putExtras(b);
        this.startActivityForResult(intent, Constants.PLAYER_ASSIGNMENT_REQ);
        overridePendingTransition (R.anim.right_slide_in, R.anim.right_slide_out);
    }
    public void gameLengthPressed(View view) {
        Intent intent = new Intent(this, GameLength.class);
        Bundle b = new Bundle();
        b.putInt("time", 0); // Insert 0 so the index in GameLength is 0, the "Select one" check.
        intent.putExtras(b);
        this.startActivityForResult(intent, Constants.GAME_LEN_REQ);
        overridePendingTransition (R.anim.right_slide_in, R.anim.right_slide_out);
    }
    public void startPressed(View view) {
        Intent intent = new Intent(this, Start.class);
        Bundle b = new Bundle();
        b.putInt("time", gameLen);
        intent.putExtras(b);
        this.startActivityForResult(intent, Constants.START_REQ);
        overridePendingTransition (R.anim.right_slide_in, R.anim.right_slide_out);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
            case Constants.GAME_MODE_REQ:
                if(resultCode == RESULT_OK) {
                    Button gameMode = (Button)findViewById(R.id.game_mode);
                    int result = data.getIntExtra("result", -1);
                    switch (result) {
                        case Constants.TEAMS:
                            gameMode.setText("Game Mode: Team Play");
                            break;
                        case Constants.FFA:
                            gameMode.setText("Game Mode: Free For All");
                            break;
                    }
                }
                break;
            case Constants.NUM_PLAYERS_REQ:
                if(resultCode == RESULT_OK) {
                    Button numPlayersBtn = (Button)findViewById(R.id.num_players);
                    numPlayers = data.getIntExtra("result", -1);
                    numPlayersBtn.setText( "Number of Players: " + numPlayers);
                }
                break;
            case Constants.PLAYER_ASSIGNMENT_REQ:
                if(resultCode == RESULT_OK) {
                    vests = data.getIntArrayExtra("vests");
                }
                break;
            case Constants.GAME_LEN_REQ:
                if(resultCode == RESULT_OK) {
                    Button gameLenButton = (Button)findViewById(R.id.game_length);
                    gameLen = data.getIntExtra("result", -1);
                    gameLenButton.setText("Game Length: " + gameLen);
                }
                break;
            case Constants.START_REQ:
                if (resultCode == RESULT_OK) {
                    finish();
                }
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vests = new int[6];
        gameLen = 1;
        setContentView(R.layout.config_view);
    }
}