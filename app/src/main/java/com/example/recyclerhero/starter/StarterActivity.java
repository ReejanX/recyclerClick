
package com.example.recyclerhero.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.recyclerhero.main.MainActivity;
import com.example.recyclerhero.R;

public class StarterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StarterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        },2000);


    }
}