package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {

    private Button proximo10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        proximo10 = (Button) findViewById(R.id.proximo10);

        proximo10.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {

                proximo10Activity();



            }


        });



    }

    private void proximo10Activity(){


        startActivity(new Intent(MainActivity10.this, MainActivity11.class));
    }


}





