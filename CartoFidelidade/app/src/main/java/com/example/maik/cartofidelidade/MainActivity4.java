package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    private Button salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        salvar = (Button) findViewById(R.id.salvar);

        salvar.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {

                salvarActivity();



            }


        });



    }

    private void salvarActivity(){


        startActivity(new Intent(MainActivity4.this, MainActivity5.class));
    }


}





