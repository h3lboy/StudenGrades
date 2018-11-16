package com.example.fraulyhenriquez.studengrades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_input;
    TextView txt_Result;
    Button btn_Sudmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        edt_input = (EditText)findViewById(R.id.edt_input);
        txt_Result = (TextView) findViewById(R.id.txt_result);
        btn_Sudmit = (Button)findViewById(R.id.btn_Sumit);

        btn_Sudmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt_input != null){

                    String a = edt_input.getText().toString();
                    int b = Integer.parseInt(a);

                    if (b >= 90){

                        txt_Result.setText("Your grade is a A");

                    }
                    else if (b >=80){
                        txt_Result.setText("Your grade is a B");
                    }
                    else if (b >=70){
                        txt_Result.setText("Your grade is a C");
                    }

                    else if (b >=65){
                        txt_Result.setText("Your grade is a C+");
                    }
                    else{
                        txt_Result.setText("Your grade is a F");
                    }


                }


            }
        });



    }




}
