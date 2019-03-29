package com.example.corto;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import com.example.corto.utilities.AppConstants;

import org.json.JSONException;
import org.json.JSONObject;

public class secondActivity extends AppCompatActivity {

    private TextView tv_userResult, tv_emailResult, tv_total;
    private Button btn1_i,btn2_i,btn3_i,btn4_i,btn5_i,btn6_i,btn7_i,btn8_i,btn9_i, btnshare;
    String cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9, txt1, txt2, txt3;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


        tv_userResult = findViewById(R.id.tv_userResult);
        tv_emailResult = findViewById(R.id.tv_emailResult);
        tv_total = findViewById(R.id.tv_total);

        btn1_i = findViewById(R.id.btn1_i);
        btn2_i = findViewById(R.id.btn2_i);
        btn3_i = findViewById(R.id.btn3_i);
        btn4_i = findViewById(R.id.btn4_i);
        btn5_i = findViewById(R.id.btn5_i);
        btn6_i = findViewById(R.id.btn6_i);
        btn7_i = findViewById(R.id.btn7_i);
        btn8_i = findViewById(R.id.btn8_i);
        btn9_i = findViewById(R.id.btn9_i);

        btnshare = findViewById(R.id.btnshare);

        final JSONObject jsonx=new JSONObject();

        Intent nuevoIntent = getIntent();

        cont1 = cont2 = cont3 = cont4 = cont5 = cont6 = cont7 = cont8 = cont9 = txt1 = txt2 = txt3 = "ACA VA ALGO!";

        if(nuevoIntent !=null){
            txt1 = nuevoIntent.getStringExtra(AppConstants.TEXT_USER);
            txt2 = nuevoIntent.getStringExtra(AppConstants.TEXT_EMAIL);
            txt3 = nuevoIntent.getStringExtra(AppConstants.TEXT_TOTAL);

            cont1 = nuevoIntent.getStringExtra(AppConstants.TEXT_BTN1);
            cont2 = nuevoIntent.getStringExtra(AppConstants.TEXT_BTN2);
            cont3 = nuevoIntent.getStringExtra(AppConstants.TEXT_BTN3);
            cont4 = nuevoIntent.getStringExtra(AppConstants.TEXT_BTN4);
            cont5 = nuevoIntent.getStringExtra(AppConstants.TEXT_BTN5);
            cont6 = nuevoIntent.getStringExtra(AppConstants.TEXT_BTN6);
            cont7 = nuevoIntent.getStringExtra(AppConstants.TEXT_BTN7);
            cont8 = nuevoIntent.getStringExtra(AppConstants.TEXT_BTN8);
            cont9 = nuevoIntent.getStringExtra(AppConstants.TEXT_BTN9);
        }


        tv_userResult.setText("usuario: "+ txt1);
        tv_emailResult.setText("mail: "+ txt2);
        tv_total.setText("total: "+ txt3);

        btn1_i.setText(""+ cont1);
        btn2_i.setText(""+ cont2);
        btn3_i.setText(""+ cont3);
        btn4_i.setText(""+ cont4);
        btn5_i.setText(""+ cont5);
        btn6_i.setText(""+ cont6);
        btn7_i.setText(""+ cont7);
        btn8_i.setText(""+ cont8);
        btn9_i.setText("" + cont9);

        try {
            jsonx.put("user",txt1);
            jsonx.put("pass",txt2);
            jsonx.put("email",txt3);
            jsonx.put("cantidad1",cont1);
            jsonx.put("cantidad2",cont2);
            jsonx.put("cantidad3",cont3);
            jsonx.put("cantidad4",cont4);
            jsonx.put("cantidad5",cont5);
            jsonx.put("cantidad6",cont6);
            jsonx.put("cantidad7",cont7);
            jsonx.put("cantidad8",cont8);
            jsonx.put("cantidad9",cont9);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent=new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT,jsonx.toString());
                startActivity(shareIntent);
            }

        });

    }

}
