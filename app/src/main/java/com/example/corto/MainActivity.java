package com.example.corto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.corto.utilities.AppConstants;

public class MainActivity extends AppCompatActivity {


    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, btnsubmit;
    private EditText et_user, et_email;
    private Integer contT=0, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0, cont8=0, cont9=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        et_user = findViewById(R.id.et_user);
        et_email = findViewById(R.id.et_email);

        btnsubmit = findViewById(R.id.btnsubmit);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont1 = cont1 +1;
                btn1.setText("producto 1\n" + cont1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont2 = cont2 +1;
                btn2.setText("producto 2\n" + cont2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont3 = cont3 +1;
                btn3.setText("producto 4\n" + cont3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont4 = cont4 +1;
                btn4.setText("producto 4\n" + cont4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont5 = cont5 +1;
                btn5.setText("producto 5\n" + cont5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont6 = cont6 +1;
                btn6.setText("producto 6\n" + cont6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont7 = cont7 +1;
                btn7.setText("producto 7\n" + cont7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont8 = cont8 +1;
                btn8.setText("producto 8\n" + cont8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont9 = cont9 +1;
                btn9.setText("producto 9\n" + cont9);
            }
        });

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contT= cont1 + cont2 + cont3 + cont4 + cont5 + cont6 + cont7 + cont8 + cont9;

                Intent mIntent = new Intent(MainActivity.this, secondActivity.class);

                mIntent.putExtra(AppConstants.TEXT_USER, et_user.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_EMAIL, et_email.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_TOTAL, Integer.toString(contT));

                mIntent.putExtra(AppConstants.TEXT_BTN1, btn1.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_BTN2, btn2.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_BTN3, btn3.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_BTN4, btn4.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_BTN5, btn5.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_BTN6, btn6.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_BTN7, btn7.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_BTN8, btn8.getText().toString());
                mIntent.putExtra(AppConstants.TEXT_BTN9, btn9.getText().toString());

                startActivity(mIntent);


            }
        });

    }
}
