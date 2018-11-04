package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        entrar = (Button) findViewById(R.id.entrar);

        entrar.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {

                entrarActivity();



            }


        });



    }

    private void entrarActivity(){


        startActivity(new Intent(MainActivity2.this, MainActivity3.class));
    }


}





