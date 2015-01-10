package com.example.michael.lasertag;

import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;

// TODO: TIMER
// TODO: SCORE DATABASE screen
// TODO: TAKE INPUT on vest screen for player ID, for DATABASE

public class GameMode extends Activity {
    public void teamsPressed(View view) {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", Constants.TEAMS);
        setResult(RESULT_OK, returnIntent);
        finish();
    }
    public void freeForAllPressed(View view) {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", Constants.FFA);
        setResult(RESULT_OK, returnIntent);
        finish();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_mode_view);
    }
}