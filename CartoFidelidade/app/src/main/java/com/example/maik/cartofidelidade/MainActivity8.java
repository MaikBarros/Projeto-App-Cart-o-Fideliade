package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    private Button proximo8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        proximo8 = (Button) findViewById(R.id.proximo8);

        proximo8.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {

                proximo8Activity();



            }


        });



    }

    private void proximo8Activity(){


        startActivity(new Intent(MainActivity8.this, MainActivity9.class));
    }


}





