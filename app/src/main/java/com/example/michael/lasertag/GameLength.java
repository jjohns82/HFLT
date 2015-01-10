package com.example.michael.lasertag;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class GameLength extends Activity implements OnItemSelectedListener {
    private static int gameLen;
    private static Spinner spinner;
    private static List<Integer> timeList;

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        if (pos != 0) {
            String s = timeList.get(pos).toString();
            System.out.println(s);
            Intent returnIntent = new Intent();
            returnIntent.putExtra("result", timeList.get(pos));
            setResult(RESULT_OK, returnIntent);
            finish();
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_length_view);

        timeList = new ArrayList<Integer>();

        timeList.add(-1); // For the "Select one" option
        timeList.add(1);
        timeList.add(2);
        timeList.add(3);
        timeList.add(4);
        timeList.add(5);
        timeList.add(10);
        timeList.add(15);
        timeList.add(20);

        spinner = (Spinner) findViewById(R.id.game_length_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.game_len_arr, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Bundle b = getIntent().getExtras();
        gameLen = b.getInt("time");

        spinner.setSelection(timeList.indexOf(gameLen));

        spinner.setOnItemSelectedListener(this);
    }
}