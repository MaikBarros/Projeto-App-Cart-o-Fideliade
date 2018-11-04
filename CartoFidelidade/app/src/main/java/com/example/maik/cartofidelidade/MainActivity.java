package com.example.maik.cartofidelidade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button login, loginfacebook, cadastrese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.login);
        loginfacebook = (Button) findViewById(R.id.loginfacebook);
        cadastrese = (Button) findViewById(R.id.cadastrese);

        login.setOnClickListener(new View.OnClickListener(){



                    @Override
                    public void onClick(View v) {

                        loginActivity();



                    }


        });



    }

    private void loginActivity(){


         startActivity(new Intent(MainActivity.this, MainActivity2.class));
    }


}





