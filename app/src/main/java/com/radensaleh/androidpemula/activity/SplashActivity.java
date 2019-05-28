package com.radensaleh.androidpemula.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.Wave;
import com.radensaleh.androidpemula.R;

public class SplashActivity extends AppCompatActivity {

    private ProgressBar pb;
    private TextView tvTunggu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        pb = findViewById(R.id.pb);
        tvTunggu = findViewById(R.id.tvTunggu);
        progressBar(pb);

    }

    public void progressBar(final ProgressBar pb){
        Sprite sprite = new Wave();
        pb.setIndeterminateDrawable(sprite);

        Runnable rn = new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                tvTunggu.setVisibility(View.INVISIBLE);
                pb.setVisibility(View.INVISIBLE);
            }
        };

        Handler handler = new Handler();
        handler.postDelayed(rn, 3500);
    }
}
