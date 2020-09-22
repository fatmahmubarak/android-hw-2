package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { //start1
    EditText n1;
    EditText n2;
    EditText n3;
    EditText n4;
    TextView tv;
    Button ad, rt;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //start2
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.editText);
        n2 = (EditText) findViewById(R.id.editText2);
        n3 = (EditText) findViewById(R.id.editText3);
        n4 = (EditText) findViewById(R.id.editText4);
        tv = (TextView) findViewById(R.id.textView);
        ad = (Button) findViewById(R.id.button);
        rt = (Button) findViewById(R.id.button1);
//        sub = (Button) findViewById(R.id.button2);
//        div = (Button) findViewById(R.id.button3);
//
        ad.setOnClickListener(new View.OnClickListener() { //start3
            @Override
            public void onClick(View view) {
              Integer no1 = Integer.parseInt(n1.getText().toString());
              Integer no2 = Integer.parseInt(n2.getText().toString());
        Integer no3 = Integer.parseInt(n3.getText().toString());
  Integer no4 = Integer.parseInt(n4.getText().toString());

//                Integer no1 = Integer.parseInt(n1.getText().toString())*(15/100);
//                Integer no2 = Integer.parseInt(n2.getText().toString())*(25/100);
//                Integer no3 = Integer.parseInt(n3.getText().toString())*(30/100);
//                Integer no4 = Integer.parseInt(n4.getText().toString())*(30/100);

              Integer add = no1+no2+no3+no4;
              tv.setText(add.toString());
          }
      });//end3

      rt.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
//              Integer no1 = Integer.parseInt(n1.getText().toString());
//              Integer no2 = Integer.parseInt(n2.getText().toString());
//              Integer no3 = Integer.parseInt(n3.getText().toString());
//              Integer no4 = Integer.parseInt(n4.getText().toString());

              n1.setText("");
              n2.setText("");
              n3.setText("");
              n4.setText("");
              tv.setText("Result");
          }
      });
//
//        sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Integer no1 = Integer.parseInt(n1.getText().toString())*0.15;
//                Integer no2 = Integer.parseInt(n2.getText().toString())*0.25;
//
//                Integer add = no1-no2;
//                tv.setText(add.toString());
//            }
//        });
//

        //        mul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Integer no1 = Integer.parseInt(n1.getText().toString());
//                Integer no2 = Integer.parseInt(n2.getText().toString());
//
//                Integer add = no1*no2;
//                tv.setText(add.toString());
//            }
//        });
//
//        div.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Integer no1 = Integer.parseInt(n1.getText().toString());
//                Integer no2 = Integer.parseInt(n2.getText().toString());
//
//                Integer add = no1/no2;
//                tv.setText(add.toString());
//            }
//        });

    } //end2
} //end1