package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView2;
    String s;
    Button clear, e, pi, divide, add, subtract, multiply, equal, del;

    Button one, two, three, four, five, six, seven, eight, nine, point, zero ;

    //Booleans for Operations functions
    boolean bAdd, bSub, bMult, bDiv ;


    float Value1,Value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //code for hide title bar.
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView3);

        clear = findViewById(R.id.buttonClearText);
        pi = findViewById(R.id.buttonPi);
        e = findViewById(R.id.buttonE);
        divide = findViewById(R.id.buttonDivide);
        add = findViewById(R.id.buttonAdd);
        subtract = findViewById(R.id.buttonSubtraction);
        multiply = findViewById(R.id.buttonMultiply);
        equal = findViewById(R.id.buttonEqual);
        del = findViewById(R.id.buttonDel);

        one = findViewById(R.id.button1);
        two = findViewById(R.id.button2);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);
        point = findViewById(R.id.buttonPoint);
        zero = findViewById(R.id.buttonZero);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                textView.setText(null);
            }
        });


        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "2.71828");

            }
        });

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "3.14159265");
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(textView2.getText() + "/");
                if (textView == null){
                    textView.setText("");
                }else {
                    Value1 = Float.parseFloat(textView.getText() + "");
                    bDiv = true;
                    textView.setText(null);
                }
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(textView2.getText() + "+");
                if (textView == null){
                    textView.setText("");
                }else {
                    Value1 = Float.parseFloat(textView.getText() + "");
                    bAdd = true;
                    textView.setText(null);
                }
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(textView2.getText() + "-");
                Value1 = Float.parseFloat(textView.getText() + "");
                bSub = true ;
                textView.setText(null);

            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(textView2.getText() + "X");
                Value1 = Float.parseFloat(textView.getText() + "");
                bMult = true ;
                textView.setText(null);

            }
        });


        equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                textView2.setText(null);
                Value2 = Float.parseFloat(textView.getText() + "");

                if (bAdd == true){

                    textView.setText(Value1 + Value2 +"");
                    bAdd=false;
                }


                if (bSub == true){
                    textView.setText(Value1 - Value2 +"");
                    bSub=false;
                }

                if (bMult == true){
                    textView.setText(Value1 * Value2 + "");
                    bMult=false;
                }

                if (bDiv == true)
                {
                    textView.setText((Value1 / Value2) + "");
                    bDiv=false;


                }

            }
        });


        del.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                s = textView.getText().toString();
                s = s.substring(0,s.length()-1);
                textView.setText(s);
            }
        });

        one.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                textView.setText(textView.getText() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                textView.setText(textView.getText() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "5");

            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "6");

            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "9");

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + ".");

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "0");

            }
        });
    }

}