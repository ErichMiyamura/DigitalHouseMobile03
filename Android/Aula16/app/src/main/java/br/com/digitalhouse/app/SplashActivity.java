package br.com.digitalhouse.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private ImageView imageViewSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageViewSplash = (ImageView) findViewById(R.id.imageview_splash); // retorna uma instacia de uma view
        imageViewSplash.setOnClickListener(new View.OnClickListener() { // ouvir um evento de click
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
