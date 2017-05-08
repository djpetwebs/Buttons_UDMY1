package com.beebaby3.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mFirstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstButton = (Button) findViewById(R.id.bFirstButton);

        mFirstButton.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {

        Log.d(TAG, "First Button Clicked.");
    }
}
