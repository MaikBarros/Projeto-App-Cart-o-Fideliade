package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    private Button confirmar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        confirmar2 = (Button) findViewById(R.id.confirmar2);

        confirmar2.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {

                confirmar2Activity();



            }


        });



    }

    private void confirmar2Activity(){


        startActivity(new Intent(MainActivity7.this, MainActivity8.class));
    }


}





