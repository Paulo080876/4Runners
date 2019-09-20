package es.akoka.a4runners.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import es.akoka.a4runners.MainActivity;
import es.akoka.a4runners.R;

public class ActivitySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //creamos un hilo de 1 segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent v_intent  = new Intent(ActivitySplash.this, MainActivity.class);
                startActivity(v_intent);
                finish();
            }
        },3000);
    }
}
