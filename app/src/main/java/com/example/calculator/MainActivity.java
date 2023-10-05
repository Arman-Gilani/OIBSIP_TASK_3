package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar1;
    TextView inputTextview, outputTextview;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(Color.BLACK);

        toolbar1 = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);

        inputTextview = findViewById(R.id.inputTextview);
        outputTextview = findViewById(R.id.outputTextview);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);

        button1.setOnClickListener(v -> {
            inputTextview.setText("");
            inputTextview.setText("0");
            outputTextview.setText("0");
        });

        button2.setOnClickListener(v -> {

            if(inputTextview.getText().toString().equals("0")){
                inputTextview.setText("0");
                outputTextview.setText("0");
            }
            else if(inputTextview.getText().toString().isEmpty()) {
                inputTextview.setText("0");
                outputTextview.setText("0");
            }
            else{
                String a = inputTextview.getText().toString();
                a = a.substring(0,a.length()-1);
                inputTextview.setText(a);
            }
        });

        button3.setOnClickListener(v -> {
            inputTextview.setText(inputTextview.getText().toString()+"%");
        });

        button4.setOnClickListener(v -> {
            inputTextview.setText(inputTextview.getText().toString()+"/");
        });

        button5.setOnClickListener(v -> {
            if(inputTextview.getText().toString().equals("0")) {
                inputTextview.setText("");
                inputTextview.setText("7");
            }
            else {
                String s = inputTextview.getText().toString()+"7";
                inputTextview.setText(s);
            }

            char demo = inputTextview.getText().toString().charAt(inputTextview.getText().toString().length()-1);
            if (demo != '+' || demo != '-' || demo != '-' || demo != '/' || demo != '%'){

                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        button6.setOnClickListener(v -> {
            if(inputTextview.getText().toString().equals("0")) {
                inputTextview.setText("");
                inputTextview.setText("8");
            }
            else {
                String s = inputTextview.getText().toString()+"8";
                inputTextview.setText(s);
            }

            char demo = inputTextview.getText().toString().charAt(inputTextview.getText().toString().length()-1);
            if (demo != '+' || demo != '-' || demo != '-' || demo != '/' || demo != '%'){

                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        button7.setOnClickListener(v -> {
            if(inputTextview.getText().toString().equals("0")) {
                inputTextview.setText("");
                inputTextview.setText("9");
            }
            else {
                String s = inputTextview.getText().toString()+"9";
                inputTextview.setText(s);
            }

            char demo = inputTextview.getText().toString().charAt(inputTextview.getText().toString().length()-1);
            if (demo != '+' || demo != '-' || demo != '-' || demo != '/' || demo != '%'){

                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        button8.setOnClickListener(v -> {
            inputTextview.setText(inputTextview.getText().toString()+"*");
        });

        button9.setOnClickListener(v -> {
            if(inputTextview.getText().toString().equals("0")) {
                inputTextview.setText("");
                inputTextview.setText("4");
            }
            else {
                String s = inputTextview.getText().toString()+"4";
                inputTextview.setText(s);
            }

            char demo = inputTextview.getText().toString().charAt(inputTextview.getText().toString().length()-1);
            if (demo != '+' || demo != '-' || demo != '-' || demo != '/' || demo != '%'){

                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        button10.setOnClickListener(v -> {
            if(inputTextview.getText().toString().equals("0")) {
                inputTextview.setText("");
                inputTextview.setText("5");
            }
            else {
                String s = inputTextview.getText().toString()+"5";
                inputTextview.setText(s);
            }

            char demo = inputTextview.getText().toString().charAt(inputTextview.getText().toString().length()-1);
            if (demo != '+' || demo != '-' || demo != '-' || demo != '/' || demo != '%'){

                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        button11.setOnClickListener(v -> {
            if(inputTextview.getText().toString().equals("0")) {
                inputTextview.setText("");
                inputTextview.setText("6");
            }
            else {
                String s = inputTextview.getText().toString()+"6";
                inputTextview.setText(s);
            }

            char demo = inputTextview.getText().toString().charAt(inputTextview.getText().toString().length()-1);
            if (demo != '+' || demo != '-' || demo != '-' || demo != '/' || demo != '%'){

                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        button12.setOnClickListener(v -> {
            inputTextview.setText(inputTextview.getText().toString()+"-");
        });

        button13.setOnClickListener(v -> {
            if(inputTextview.getText().toString().equals("0")) {
                inputTextview.setText("");
                inputTextview.setText("1");
            }
            else {
                String s = inputTextview.getText().toString()+"1";
                inputTextview.setText(s);
            }

            char demo = inputTextview.getText().toString().charAt(inputTextview.getText().toString().length()-1);
            if (demo != '+' || demo != '-' || demo != '-' || demo != '/' || demo != '%'){

                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        button14.setOnClickListener(v -> {

            if(inputTextview.getText().toString().equals("0")) {
                inputTextview.setText("");
                inputTextview.setText("2");
            }
            else {
                String s = inputTextview.getText().toString()+"2";
                inputTextview.setText(s);
            }

            char demo = inputTextview.getText().toString().charAt(inputTextview.getText().toString().length()-1);
            if (demo != '+' || demo != '-' || demo != '-' || demo != '/' || demo != '%'){

                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        button15.setOnClickListener(v -> {
            if(inputTextview.getText().toString().equals("0")) {
                inputTextview.setText("");
                inputTextview.setText("3");
            }
            else {
                String s = inputTextview.getText().toString()+"3";
                inputTextview.setText(s);
            }

            char demo = inputTextview.getText().toString().charAt(inputTextview.getText().toString().length()-1);
            if (demo != '+' || demo != '-' || demo != '-' || demo != '/' || demo != '%'){

                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        button16.setOnClickListener(v -> {
            inputTextview.setText(inputTextview.getText().toString()+"+");
        });

        button17.setOnClickListener(v -> {
            if(inputTextview.getText().toString().equals("0")) {
                inputTextview.setText("");
                inputTextview.setText("0");
            }
            else {
                String s = inputTextview.getText().toString()+"0";
                inputTextview.setText(s);
            }

            char demo = inputTextview.getText().toString().charAt(inputTextview.getText().toString().length()-1);
            if (demo != '+' || demo != '-' || demo != '-' || demo != '/' || demo != '%'){

                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        button18.setOnClickListener(v -> {
            String s = inputTextview.getText().toString()+".";
            inputTextview.setText(s);
        });

        button19.setOnClickListener(v -> {

            if (!inputTextview.getText().toString().equals("")) {
                String a = inputTextview.getText().toString();
                String result = getResult(a);
                if(!result.equals("error")){
                    outputTextview.setText(result);
                    inputTextview.setText("");
                }
                else {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }

    String getResult(String data){
        try {
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult = context.evaluateString(scriptable,data,"Javascript", 1,null).toString();
            return finalResult;
        }
        catch (Exception e) {
            return "error";
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.scientificcalculator) {
            startActivity(new Intent(getApplicationContext(),ScientificCalculator.class));
            return true;
        } else if(item.getItemId() == R.id.closeapp) {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Alert!");
            builder.setMessage("Do you want to exit?");
            builder.setCancelable(false);
            builder.setPositiveButton("YES",(dialog, which) -> finish());
            builder.setNegativeButton("NO",(dialog, which) -> dialog.cancel());
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Alert!");
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(false);
        builder.setPositiveButton("YES",(dialog, which) -> finish());
        builder.setNegativeButton("NO",(dialog, which) -> dialog.cancel());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}