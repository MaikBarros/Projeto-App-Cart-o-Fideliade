package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    private Button salvar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        salvar2 = (Button) findViewById(R.id.salvar2);

        salvar2.setOnClickListener(new View.OnClickListener(){



            @Override
            public void onClick(View v) {

                salvar2Activity();



            }


        });



    }

    private void salvar2Activity(){


        startActivity(new Intent(MainActivity5.this, MainActivity6.class));
    }


}





