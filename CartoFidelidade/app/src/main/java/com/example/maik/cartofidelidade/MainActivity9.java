package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {

    private Button proximo9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        proximo9 = (Button) findViewById(R.id.proximo9);

        proximo9.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {

                proximo9Activity();



            }


        });



    }

    private void proximo9Activity(){


        startActivity(new Intent(MainActivity9.this, MainActivity10.class));
    }


}





