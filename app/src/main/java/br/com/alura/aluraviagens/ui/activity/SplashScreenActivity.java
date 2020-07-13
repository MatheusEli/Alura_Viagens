package br.com.alura.aluraviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import br.com.alura.aluraviagens.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final Intent intent = new Intent(this, ListaPacotesActivity.class);
        Handler handle = new Handler();

        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        }, 3000);
    }
}