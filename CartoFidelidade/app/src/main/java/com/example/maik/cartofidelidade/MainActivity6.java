package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    private Button confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        confirmar = (Button) findViewById(R.id.confirmar);

        confirmar.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {

                confirmarActivity();



            }


        });



    }

    private void confirmarActivity(){


        startActivity(new Intent(MainActivity6.this, MainActivity7.class));
    }


}





