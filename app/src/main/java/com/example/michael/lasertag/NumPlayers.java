package com.example.michael.lasertag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NumPlayers extends Activity {
    public void twoPressed(View view) {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", Constants.TWO_PLAYERS);
        setResult(RESULT_OK, returnIntent);
        finish();
    }
    public void fourPressed(View view) {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", Constants.FOUR_PLAYERS);
        setResult(RESULT_OK, returnIntent);
        finish();
    }
    public void sixPressed(View view) {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", Constants.SIX_PLAYERS);
        setResult(RESULT_OK, returnIntent);
        finish();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num_players_view);
    }
}