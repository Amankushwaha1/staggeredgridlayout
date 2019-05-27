package com.example.staggeredgridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class linear extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText edittextview;

    float mValueOne, mValueTwo;

    boolean adiition, mSubtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        edittextview = (EditText) findViewById(R.id.edt1);

        buttonAdd.setEnabled(false);buttonSub.setEnabled(false);buttonMul.setEnabled(false);buttonDivision.setEnabled(false);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + "1"); buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + "2"); buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + "3"); buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + "4"); buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + "5"); buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + "6"); buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + "7"); buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + "8"); buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + "9"); buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }

        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + "0"); buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }
        });



        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonAdd.setEnabled(false);
                if (edittextview == null) {
                    edittextview.setText("");
                } else {
                    mValueOne = Float.parseFloat(edittextview.getText() + "");
                    adiition = true;
                    edittextview.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSub.setEnabled(false);
                mValueOne = Float.parseFloat(edittextview.getText() + "");
                mSubtract = true;
                edittextview.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMul.setEnabled(false);
                mValueOne = Float.parseFloat(edittextview.getText() + "");
                multiply = true;
                edittextview.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonDivision.setEnabled(false);
                mValueOne = Float.parseFloat(edittextview.getText() + "");
                divide = true;
                edittextview.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edittextview.getText() + "");

                if (adiition == true) {
                    edittextview.setText(mValueOne + mValueTwo + "");
                    adiition = false;
                }

                if (mSubtract == true) {
                    edittextview.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (multiply == true) {
                    edittextview.setText(mValueOne * mValueTwo + "");
                    multiply = false;
                }

                if (divide == true) {
                    edittextview.setText(mValueOne / mValueTwo + "");
                    divide = false;
                }buttonAdd.setEnabled(true);buttonSub.setEnabled(true);buttonMul.setEnabled(true);buttonDivision.setEnabled(true);
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittextview.setText(edittextview.getText() + ".");
            }
        });
    }
}
