package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity11 extends AppCompatActivity {



    private Button fim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        fim = (Button) findViewById(R.id.fim);

        fim.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {

                fimActivity();



            }


        });



    }

    private void fimActivity(){


        startActivity(new Intent(MainActivity11.this, MainActivity.class));
    }


}





