package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText number1 , number2;
    TextView txt_view;

    double n1, n2;



    public boolean get_numbers() {
        number1 = (EditText) findViewById(R.id.edit_text1);
        number2 = (EditText) findViewById(R.id.edit_text2);
        txt_view = (TextView) findViewById(R.id.textView);
        String s1 = number1.getText().toString();
        String s2 = number2.getText().toString();
        txt_view.setText("RESULT : ");
        if ((s1.equals(null)|| s2.equals(null))

                || (s1.equals("") ||s2.equals(""))) {

            Toast toast= Toast.makeText(getApplicationContext(),"Enter the numbers!",Toast.LENGTH_SHORT);
            toast.show();
            return false;
        } else {
            n1 = Double.parseDouble(s1);
            n2 = Double.parseDouble(s2);
            return true;
        }

    }


    public void sum(View view) {

        if (get_numbers()) {
            double result = n1 + n2;
            txt_view.append(Double.toString(result));
        }
    }
    public void multiply (View view){
        if (get_numbers()) {
            double result = n1 * n2;
            txt_view.append(Double.toString(result));
        }
    }
    public void divide (View view){

        if (get_numbers()) {
            double result = n1/(n2);
            txt_view.append(Double.toString(result));
        }
    }
    public void substract (View view){
        if(get_numbers()){ double result=n1-n2;
            txt_view.append(Double.toString(result));}
    }
    public void Clear(View view){
        txt_view.setText("RESULT : ");

    }

}