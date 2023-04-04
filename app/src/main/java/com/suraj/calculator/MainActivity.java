package com.suraj.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView txtNumbersForInput, txtAnswer;
    Button btnClearAll, btnClearOne, btnPercent, btnDivide, btnMultiply, btnMinus, btnPlus, btnCalculate, btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;

    String userInput = "";
    long number1 = 0;
    long number2 = 0;
    char sign = '0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //id binding
        initViews();

        //handling the user clicks
        setOnClick();

    }

    private void initViews() {

        txtNumbersForInput = findViewById(R.id.txtNumbersForCalculation);
        txtAnswer = findViewById(R.id.txtAnswer);

        btnClearAll = findViewById(R.id.btnClearAll);
        btnClearOne = findViewById(R.id.btnClearOne);
        btnPercent = findViewById(R.id.btnPercent);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);

    }

    // Create an OnClickListener instance
    View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Get the text of the clicked button
            String buttonText = ((Button) v).getText().toString();

            // Handle button click based on the button text
            switch (buttonText) {
                case "0":
                    if (userInput!="") {
                        setInputData("0");
                    }
                    break;
                case "1":
                    setInputData("1");
                    break;
                case "2":
                    setInputData("2");
                    break;
                case "3":
                    setInputData("3");
                    break;
                case "4":
                    setInputData("4");
                    break;
                case "5":
                    setInputData("5");
                    break;
                case "6":
                    setInputData("6");
                    break;
                case "7":
                    setInputData("7");
                    break;
                case "8":
                    setInputData("8");
                    break;
                case "9":
                    setInputData("9");
                    break;
                case "+":

                    number1 = Long.parseLong(userInput);
                    userInput = "";
                    if (number1 > 0) {
                        sign = '+';
                        setSigntData("+");
                    }

                    break;
                case "-":
                    // Handle minus button click
                    number1 =Long.parseLong(userInput);
                    userInput = "";
                    if (number1 > 0) {
                        sign = '-';
                        setSigntData("-");
                    }
                    break;
                case "*":
                    // Handle multiply button click
                    number1 = Long.parseLong(userInput);
                    userInput = "";
                    if (number1 > 0) {
                        sign = '*';
                        setSigntData("*");
                    }
                    break;
                case "/":
                    // Handle divide button click
                    number1 =Long.parseLong(userInput);
                    userInput = "";
                    if (number1 > 0) {
                        sign = '/';
                        setSigntData("/");

                    }
                    break;
                case "=":
                    // Handle equals button click
                    number2 = Long.parseLong(userInput);
                    userInput = "";

                    switch (sign) {
                        case '+':
                            setInputData(String.valueOf(number1 + number2));
                            break;
                        case '-':
                            setInputData(String.valueOf(number1 - number2));
                            break;
                        case '*':
                            setInputData(String.valueOf(number1 * number2));
                            break;
                        case '/':
                            setInputData(String.valueOf(number1 / number2));
                            break;
                    }

                    break;
                case "C":
                    userInput = "";
                    number1 = 0;
                    number2 = 0;
                    txtNumbersForInput.setText("");
                    break;
            }
        }
    };

    private void setInputData(String s) {

        userInput = userInput + s;
        txtNumbersForInput.setText(userInput);
    }
    private void setSigntData(String s) {

        txtNumbersForInput.setText(s);
    }

    private void setOnClick() {

        btnClearAll.setOnClickListener(buttonClickListener);
        btnCalculate.setOnClickListener(buttonClickListener);

        btnZero.setOnClickListener(buttonClickListener);
        btnOne.setOnClickListener(buttonClickListener);
        btnTwo.setOnClickListener(buttonClickListener);
        btnThree.setOnClickListener(buttonClickListener);
        btnFour.setOnClickListener(buttonClickListener);
        btnFive.setOnClickListener(buttonClickListener);
        btnSix.setOnClickListener(buttonClickListener);
        btnSeven.setOnClickListener(buttonClickListener);
        btnEight.setOnClickListener(buttonClickListener);
        btnNine.setOnClickListener(buttonClickListener);

        btnPlus.setOnClickListener(buttonClickListener);
        btnMinus.setOnClickListener(buttonClickListener);
        btnDivide.setOnClickListener(buttonClickListener);
        btnMultiply.setOnClickListener(buttonClickListener);

    }
}




