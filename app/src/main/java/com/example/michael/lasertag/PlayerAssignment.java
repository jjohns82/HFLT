package com.example.michael.lasertag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class PlayerAssignment extends FragmentActivity {
    private static int numPlayers;
    private static int selectedPlayers;
    private static int vests[];

    public void team1vest1(View view) {
        Button team1 = (Button)findViewById(R.id.team1_vest1);
        Button team2 = (Button)findViewById(R.id.team2_vest1);
        switch (vests[0]) {
            case Constants.UNPICKED:
                vests[0] = Constants.TEAM_1;
                team1.setBackgroundResource(R.drawable.green_button);
                team2.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_1:
                vests[0] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_2:
                break;
        }
    }
    public void team1vest2(View view) {
        Button team1 = (Button)findViewById(R.id.team1_vest2);
        Button team2 = (Button)findViewById(R.id.team2_vest2);
        switch (vests[1]) {
            case Constants.UNPICKED:
                vests[1] = Constants.TEAM_1;
                team1.setBackgroundResource(R.drawable.green_button);
                team2.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_1:
                vests[1] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_2:
                break;
        }
    }
    public void team1vest3(View view) {
        Button team1 = (Button)findViewById(R.id.team1_vest3);
        Button team2 = (Button)findViewById(R.id.team2_vest3);
        switch (vests[2]) {
            case Constants.UNPICKED:
                vests[2] = Constants.TEAM_1;
                team1.setBackgroundResource(R.drawable.green_button);
                team2.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_1:
                vests[2] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_2:
                break;
        }
    }
    public void team1vest4(View view) {
        Button team1 = (Button)findViewById(R.id.team1_vest4);
        Button team2 = (Button)findViewById(R.id.team2_vest4);
        switch (vests[3]) {
            case Constants.UNPICKED:
                vests[3] = Constants.TEAM_1;
                team1.setBackgroundResource(R.drawable.green_button);
                team2.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_1:
                vests[3] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_2:
                break;
        }
    }
    public void team1vest5(View view) {
        Button team1 = (Button)findViewById(R.id.team1_vest5);
        Button team2 = (Button)findViewById(R.id.team2_vest5);
        switch (vests[4]) {
            case Constants.UNPICKED:
                vests[4] = Constants.TEAM_1;
                team1.setBackgroundResource(R.drawable.green_button);
                team2.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_1:
                vests[4] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_2:
                break;
        }
    }
    public void team1vest6(View view) {
        Button team1 = (Button)findViewById(R.id.team1_vest6);
        Button team2 = (Button)findViewById(R.id.team2_vest6);
        switch (vests[5]) {
            case Constants.UNPICKED:
                vests[5] = Constants.TEAM_1;
                team1.setBackgroundResource(R.drawable.green_button);
                team2.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_1:
                vests[5] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_2:
                break;
        }
    }

    public void team2vest1(View view) {
        Button team2 = (Button)findViewById(R.id.team2_vest1);
        Button team1 = (Button)findViewById(R.id.team1_vest1);
        switch (vests[0]) {
            case Constants.UNPICKED:
                vests[0] = Constants.TEAM_2;
                team2.setBackgroundResource(R.drawable.green_button);
                team1.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_2:
                vests[0] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_1:
                break;
        }
    }
    public void team2vest2(View view) {
        Button team2 = (Button)findViewById(R.id.team2_vest2);
        Button team1 = (Button)findViewById(R.id.team1_vest2);
        switch (vests[1]) {
            case Constants.UNPICKED:
                vests[1] = Constants.TEAM_2;
                team2.setBackgroundResource(R.drawable.green_button);
                team1.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_2:
                vests[1] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_1:
                break;
        }
    }
    public void team2vest3(View view) {
        Button team2 = (Button)findViewById(R.id.team2_vest3);
        Button team1 = (Button)findViewById(R.id.team1_vest3);
        switch (vests[2]) {
            case Constants.UNPICKED:
                vests[2] = Constants.TEAM_2;
                team2.setBackgroundResource(R.drawable.green_button);
                team1.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_2:
                vests[2] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_1:
                break;
        }
    }
    public void team2vest4(View view) {
        Button team2 = (Button)findViewById(R.id.team2_vest4);
        Button team1 = (Button)findViewById(R.id.team1_vest4);
        switch (vests[3]) {
            case Constants.UNPICKED:
                vests[3] = Constants.TEAM_2;
                team2.setBackgroundResource(R.drawable.green_button);
                team1.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_2:
                vests[3] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_1:
                break;
        }
    }
    public void team2vest5(View view) {
        Button team2 = (Button)findViewById(R.id.team2_vest5);
        Button team1 = (Button)findViewById(R.id.team1_vest5);
        switch (vests[4]) {
            case Constants.UNPICKED:
                vests[4] = Constants.TEAM_2;
                team2.setBackgroundResource(R.drawable.green_button);
                team1.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_2:
                vests[4] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_1:
                break;
        }
    }
    public void team2vest6(View view) {
        Button team2 = (Button)findViewById(R.id.team2_vest6);
        Button team1 = (Button)findViewById(R.id.team1_vest6);
        switch (vests[5]) {
            case Constants.UNPICKED:
                vests[5] = Constants.TEAM_2;
                team2.setBackgroundResource(R.drawable.green_button);
                team1.setBackgroundResource(R.drawable.grey_button);
                selectedPlayers++;
                break;
            case Constants.TEAM_2:
                vests[5] = Constants.UNPICKED;
                team1.setBackgroundResource(R.drawable.cyan_button);
                team2.setBackgroundResource(R.drawable.cyan_button);
                selectedPlayers--;
                break;
            case Constants.TEAM_1:
                break;
        }
    }

    public void done(View view) {
        if (selectedPlayers != numPlayers) {
            new AlertDialog.Builder(this)
                .setTitle("Please re-select players")
                .setMessage("Number of players does not match number of selected " +
                            "players.")
                /*.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })*/
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
        }
        else {
            Intent returnIntent = new Intent();
            returnIntent.putExtra("vests", vests);
            setResult(RESULT_OK, returnIntent);
            finish();
        }
    }

    public void back(View view) {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("vests", vests);
        setResult(RESULT_CANCELED, returnIntent);
        finish();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_assignment_view);

        Bundle b = getIntent().getExtras();
        vests = b.getIntArray("vests");
        numPlayers = b.getInt("numPlayers");

        Button team1vest1 = (Button)findViewById(R.id.team1_vest1);
        Button team2vest1 = (Button)findViewById(R.id.team2_vest1);
        Button team1vest2 = (Button)findViewById(R.id.team1_vest2);
        Button team2vest2 = (Button)findViewById(R.id.team2_vest2);
        Button team1vest3 = (Button)findViewById(R.id.team1_vest3);
        Button team2vest3 = (Button)findViewById(R.id.team2_vest3);
        Button team1vest4 = (Button)findViewById(R.id.team1_vest4);
        Button team2vest4 = (Button)findViewById(R.id.team2_vest4);
        Button team1vest5 = (Button)findViewById(R.id.team1_vest5);
        Button team2vest5 = (Button)findViewById(R.id.team2_vest5);
        Button team1vest6 = (Button)findViewById(R.id.team1_vest6);
        Button team2vest6 = (Button)findViewById(R.id.team2_vest6);

        switch (vests[0]) {
            case Constants.TEAM_1:
                team1vest1.setBackgroundResource(R.drawable.green_button);
                team2vest1.setBackgroundResource(R.drawable.grey_button);
                break;
            case Constants.TEAM_2:
                team1vest1.setBackgroundResource(R.drawable.grey_button);
                team2vest1.setBackgroundResource(R.drawable.green_button);
                break;
        }
        switch (vests[1]) {
            case Constants.TEAM_1:
                team1vest2.setBackgroundResource(R.drawable.green_button);
                team2vest2.setBackgroundResource(R.drawable.grey_button);
                break;
            case Constants.TEAM_2:
                team1vest2.setBackgroundResource(R.drawable.grey_button);
                team2vest2.setBackgroundResource(R.drawable.green_button);
                break;
        }
        switch (vests[2]) {
            case Constants.TEAM_1:
                team1vest3.setBackgroundResource(R.drawable.green_button);
                team2vest3.setBackgroundResource(R.drawable.grey_button);
                break;
            case Constants.TEAM_2:
                team1vest3.setBackgroundResource(R.drawable.grey_button);
                team2vest3.setBackgroundResource(R.drawable.green_button);
                break;
        }
        switch (vests[3]) {
            case Constants.TEAM_1:
                team1vest4.setBackgroundResource(R.drawable.green_button);
                team2vest4.setBackgroundResource(R.drawable.grey_button);
                break;
            case Constants.TEAM_2:
                team1vest4.setBackgroundResource(R.drawable.grey_button);
                team2vest4.setBackgroundResource(R.drawable.green_button);
                break;
        }
        switch (vests[4]) {
            case Constants.TEAM_1:
                team1vest5.setBackgroundResource(R.drawable.green_button);
                team2vest5.setBackgroundResource(R.drawable.grey_button);
                break;
            case Constants.TEAM_2:
                team1vest5.setBackgroundResource(R.drawable.grey_button);
                team2vest5.setBackgroundResource(R.drawable.green_button);
                break;
        }
        switch (vests[5]) {
            case Constants.TEAM_1:
                team1vest6.setBackgroundResource(R.drawable.green_button);
                team2vest6.setBackgroundResource(R.drawable.grey_button);
                break;
            case Constants.TEAM_2:
                team1vest6.setBackgroundResource(R.drawable.grey_button);
                team2vest6.setBackgroundResource(R.drawable.green_button);
                break;
        }

        selectedPlayers = 0;
        for (int i : vests) {
            if (i == Constants.TEAM_1 || i == Constants.TEAM_2) {
                selectedPlayers++;
            }
        }
    }
}