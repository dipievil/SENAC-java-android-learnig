package br.dipievil.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Tela01Activity extends AppCompatActivity {

    private TextView lblResult;
    private EditText etValue;
    private Button btnCalc;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela01);

        lblResult = (TextView) findViewById(R.id.tvResult);
        etValue = findViewById(R.id.etValue);
        btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        calculate();
                    }
                }
        );
    }

    private void calculate(){
        String value = etValue.getText().toString();

        if(!value.isEmpty()){
            double number = Double.valueOf(value);
            double result = number * 2;
            lblResult.setText(String.valueOf(result));
        }
    }
}
