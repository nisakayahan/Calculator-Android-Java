package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.data.EvaluationValue;
import com.ezylang.evalex.parser.ParseException;


//import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    EditText numbers;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            button_nokta, button_delete, button_arti, button_eksi, button_carpma, button_bolme, button_esittir;

    View.OnClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_delete)
                {
                    numbers.setText("");
                }
                else{
                    if (view.getId() != R.id.button_esittir) {
                        numbers.setText(numbers.getText().toString() + ((Button) view).getText().toString());
                    } else {
                        try {
                            Expression exp = new Expression(numbers.getText().toString());
                            EvaluationValue result = exp.evaluate();
                            numbers.setText(result.getNumberValue().toString());
                        } catch (EvaluationException | ParseException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        };

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button_nokta = findViewById(R.id.button_nokta);
        button_delete = findViewById(R.id.button_delete);
        button_arti = findViewById(R.id.button_arti);
        button_eksi = findViewById(R.id.button_eksi);
        button_carpma = findViewById(R.id.button_carpma);
        button_bolme = findViewById(R.id.button_bolme);
        button_esittir = findViewById(R.id.button_esittir);
        numbers = findViewById(R.id.numbers);

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        button_nokta.setOnClickListener(listener);
        button_delete.setOnClickListener(listener);
        button_arti.setOnClickListener(listener);
        button_eksi.setOnClickListener(listener);
        button_carpma.setOnClickListener(listener);
        button_bolme.setOnClickListener(listener);
        button_esittir.setOnClickListener(listener);
        numbers.setOnClickListener(listener);





    }
}