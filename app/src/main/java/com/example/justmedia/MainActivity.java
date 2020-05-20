package com.example.justmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView mojoSmall = findViewById(R.id.mojoSmall);

        mojoSmall.animate().alpha(0f).setDuration(2000);

        ImageView mojoBig = findViewById(R.id.mojoBig);

        mojoBig.animate().alpha(-0f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
