package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    private Button entrar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        entrar2 = (Button) findViewById(R.id.entrar2);

        entrar2.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {

                entrar2Activity();



            }


        });



    }

    private void entrar2Activity(){


        startActivity(new Intent(MainActivity3.this, MainActivity4.class));
    }


}





