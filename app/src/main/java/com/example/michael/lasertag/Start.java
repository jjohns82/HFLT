package com.example.michael.lasertag;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.widget.Button;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;

// TODO: When running it twice, the second time has a double decrement. FIX.

public class Start extends Activity {
    private static int gameLen;
    private static int minutes;
    private static int seconds;
    private static TextView timerText;
    private static Timer timer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_active_view);

        Bundle bundle = getIntent().getExtras();
        gameLen = bundle.getInt("time");
        minutes = gameLen;
        seconds = 0;

        timerText = (TextView)findViewById(R.id.curr_time);
        timerText.setText(gameLen + ":00");

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                TimerMethod();
            }
        }, 0, 1000);

        Button b = (Button) findViewById(R.id.pause);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button switcher = (Button) v;
                if (switcher.getText().equals("PAUSE")) {
                    switcher.setText("START");
                }
                else {
                    switcher.setText("PAUSE");
                }
            }
        });
    }

    // Basically, must have to run on other thread here.
    private void TimerMethod() {
        this.runOnUiThread(Timer_Tick);
    }

    private Runnable Timer_Tick = new Runnable() {
        public void run() {
            Button b = (Button) findViewById(R.id.pause);
            // If we are running the timer, then decrement time. If done (0:00), then call stop().
            if (b.getText().equals("PAUSE")) {
                if (minutes == 0 && seconds == 0) {
                    stop(null);
                }
                else if (seconds == 0) {
                    --minutes;
                    seconds = 59;
                    timerText.setText(minutes + ":" + seconds);
                }
                else {
                    --seconds;
                    timerText.setText(minutes + ":" + String.format("%02d", seconds));
                }
            }
        }
    };

    public void stop(View view) {
        timer.cancel();
        timer.purge();
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", Constants.GAME_DONE);
        setResult(RESULT_OK, returnIntent);
        finish();
    }
}