package com.example.michael.lasertag;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    public void configurePressed(View view) {
        Intent intent = new Intent(this, ConfigScreen.class);
        this.startActivity(intent);
        overridePendingTransition (R.anim.right_slide_in, R.anim.right_slide_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
