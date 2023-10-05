package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class ScientificCalculator extends AppCompatActivity {

    Toolbar toolbar2;
    TextView sinputTextview, soutputTextview;

    Button sbutton1, sbutton2, sbutton3, sbutton4, sbutton5, sbutton6, sbutton7, sbutton8, sbutton9, sbutton10,
            sbutton11, sbutton12, sbutton13, sbutton14, sbutton15, sbutton16, sbutton17, sbutton18, sbutton19, sbutton20,
            sbutton21, sbutton22, sbutton23, sbutton24, sbutton25, sbutton26, sbutton27, sbutton28, sbutton29, sbutton30,
            sbutton31, sbutton32, sbutton33, sbutton34, sbutton35;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);
        getWindow().setStatusBarColor(Color.BLACK);
        toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        sinputTextview = findViewById(R.id.sinputTextview);
        soutputTextview = findViewById(R.id.soutputTextview);

        sbutton1 = findViewById(R.id.sbutton1);
        sbutton2 = findViewById(R.id.sbutton2);
        sbutton3 = findViewById(R.id.sbutton3);
        sbutton4 = findViewById(R.id.sbutton4);
        sbutton5 = findViewById(R.id.sbutton5);
        sbutton6 = findViewById(R.id.sbutton6);
        sbutton7 = findViewById(R.id.sbutton7);
        sbutton8 = findViewById(R.id.sbutton8);
        sbutton9 = findViewById(R.id.sbutton9);
        sbutton10 = findViewById(R.id.sbutton10);
        sbutton11 = findViewById(R.id.sbutton11);
        sbutton12 = findViewById(R.id.sbutton12);
        sbutton13 = findViewById(R.id.sbutton13);
        sbutton14 = findViewById(R.id.sbutton14);
        sbutton15 = findViewById(R.id.sbutton15);
        sbutton16 = findViewById(R.id.sbutton16);
        sbutton17 = findViewById(R.id.sbutton17);
        sbutton18 = findViewById(R.id.sbutton18);
        sbutton19 = findViewById(R.id.sbutton19);
        sbutton20 = findViewById(R.id.sbutton20);
        sbutton21 = findViewById(R.id.sbutton21);
        sbutton22 = findViewById(R.id.sbutton22);
        sbutton23 = findViewById(R.id.sbutton23);
        sbutton24 = findViewById(R.id.sbutton24);
        sbutton25 = findViewById(R.id.sbutton25);
        sbutton26 = findViewById(R.id.sbutton26);
        sbutton27 = findViewById(R.id.sbutton27);
        sbutton28 = findViewById(R.id.sbutton28);
        sbutton29 = findViewById(R.id.sbutton29);
        sbutton30 = findViewById(R.id.sbutton30);
        sbutton31 = findViewById(R.id.sbutton31);
        sbutton32 = findViewById(R.id.sbutton32);
        sbutton33 = findViewById(R.id.sbutton33);
        sbutton34 = findViewById(R.id.sbutton34);
        sbutton35 = findViewById(R.id.sbutton35);

        // AC
        sbutton1.setOnClickListener(v -> {
            sinputTextview.setText("");
            sinputTextview.setText("0");
            soutputTextview.setText("0");
        });

        // C
        sbutton2.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("0");
                    soutputTextview.setText("0");
                } else if (sinputTextview.getText().toString().isEmpty()) {
                    sinputTextview.setText("0");
                    soutputTextview.setText("0");
                } else {
                    String a = sinputTextview.getText().toString();
                    a = a.substring(0, a.length() - 1);
                    sinputTextview.setText(a);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // (
        sbutton3.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("(");
                } else {
                    String s = sinputTextview.getText().toString() + "(";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // )
        sbutton4.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText(")");
                } else {
                    String s = sinputTextview.getText().toString() + ")";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // sin
        sbutton5.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("sin");
                } else {
                    String s = sinputTextview.getText().toString() + "sin";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // cos
        sbutton6.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("cos");
                } else {
                    String s = sinputTextview.getText().toString() + "cos";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // tan
        sbutton7.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("tan");
                } else {
                    String s = sinputTextview.getText().toString() + "tan";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // log
        sbutton8.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("log");
                } else {
                    String s = sinputTextview.getText().toString() + "log";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // ln
        sbutton9.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("ln");
                } else {
                    String s = sinputTextview.getText().toString() + "ln";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // x!
        sbutton10.setOnClickListener(v -> {
            try {
                soutputTextview.setText(String.valueOf(factorial(Integer.parseInt(sinputTextview.getText().toString()))));
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // x²
        sbutton11.setOnClickListener(v -> {
            try {
                double square = Double.parseDouble(sinputTextview.getText().toString()) * Double.parseDouble(sinputTextview.getText().toString());
                soutputTextview.setText(String.valueOf(square));
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // x³
        sbutton12.setOnClickListener(v -> {
            try {
                double cube = Double.parseDouble(sinputTextview.getText().toString()) * Double.parseDouble(sinputTextview.getText().toString()) * Double.parseDouble(sinputTextview.getText().toString());
                soutputTextview.setText(String.valueOf(cube));
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // √
        sbutton13.setOnClickListener(v -> {
            try {
                double value = Math.sqrt(Double.parseDouble(sinputTextview.getText().toString()));
                soutputTextview.setText(String.valueOf(value));
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 1/x
        sbutton14.setOnClickListener(v -> {
            try {
                String[] parts = sinputTextview.getText().toString().split("/");
                if (parts.length != 2) {
                    Toast.makeText(this, "Invalid input format. Use 'x/y' format.", Toast.LENGTH_SHORT).show();
                } else {
                    double value = Double.parseDouble(parts[1]);
                    if (value == 0) {
                        Toast.makeText(this, "Division by zero is not allowed.", Toast.LENGTH_SHORT).show();
                    } else {
                        double reciprocal = 1 / value;
                        soutputTextview.setText(String.valueOf(reciprocal));
                    }
                }
            } catch (Exception e){
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // π
        sbutton15.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("3.14159");
                } else {
                    String s = sinputTextview.getText().toString() + "3.14159";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // ^
        sbutton16.setOnClickListener(v -> {
            try {
                sinputTextview.setText(sinputTextview.getText().toString() + "^");
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // nCr
        sbutton17.setOnClickListener(v -> {
            try {
                sinputTextview.setText(sinputTextview.getText().toString() + "C");
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // nPr
        sbutton18.setOnClickListener(v -> {
            try {
                sinputTextview.setText(sinputTextview.getText().toString() + "P");
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // %
        sbutton19.setOnClickListener(v -> {
            try {
                sinputTextview.setText(sinputTextview.getText().toString() + "%");
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // /
        sbutton20.setOnClickListener(v -> {
            try {
                sinputTextview.setText(sinputTextview.getText().toString() + "/");
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 7
        sbutton21.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("7");
                } else {
                    String s = sinputTextview.getText().toString() + "7";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 8
        sbutton22.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("8");
                } else {
                    String s = sinputTextview.getText().toString() + "8";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 9
        sbutton23.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("9");
                } else {
                    String s = sinputTextview.getText().toString() + "9";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // *
        sbutton24.setOnClickListener(v -> {
            try {
                sinputTextview.setText(sinputTextview.getText().toString() + "*");
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 4
        sbutton25.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("4");
                } else {
                    String s = sinputTextview.getText().toString() + "4";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 5
        sbutton26.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("5");
                } else {
                    String s = sinputTextview.getText().toString() + "5";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 6
        sbutton27.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("6");
                } else {
                    String s = sinputTextview.getText().toString() + "6";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // -
        sbutton28.setOnClickListener(v -> {
            try {
                sinputTextview.setText(sinputTextview.getText().toString() + "-");
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 1
        sbutton29.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("1");
                } else {
                    String s = sinputTextview.getText().toString() + "1";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 2
        sbutton30.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("2");
                } else {
                    String s = sinputTextview.getText().toString() + "2";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 3
        sbutton31.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("3");
                } else {
                    String s = sinputTextview.getText().toString() + "3";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // +
        sbutton32.setOnClickListener(v -> {
            try {
                sinputTextview.setText(sinputTextview.getText().toString() + "+");
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 0
        sbutton33.setOnClickListener(v -> {
            try {
                if (sinputTextview.getText().toString().equals("0")) {
                    sinputTextview.setText("");
                    sinputTextview.setText("0");
                } else {
                    String s = sinputTextview.getText().toString() + "0";
                    sinputTextview.setText(s);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // .
        sbutton34.setOnClickListener(v -> {
            try {
                sinputTextview.setText(sinputTextview.getText().toString() + ".");
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // =
        sbutton35.setOnClickListener(v -> {
            try {
                String value = sinputTextview.getText().toString();

                if (value.contains("C")) {
                    try {
                        String[] parts = sinputTextview.getText().toString().split("C");
                        int n = Integer.parseInt(parts[0]);
                        int r = Integer.parseInt(parts[1]);
                        long combination = calculateCombination(n, r);
                        soutputTextview.setText(String.valueOf(combination));
                    } catch (Exception e) {
                        Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                } else if (value.contains("P")) {
                    try {
                        String[] parts = sinputTextview.getText().toString().split("P");
                        int n = Integer.parseInt(parts[0]);
                        int r = Integer.parseInt(parts[1]);
                        long permutation = calculatePermutation(n, r);
                        soutputTextview.setText(String.valueOf(permutation));
                    } catch (Exception e) {
                        Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                } else if (!value.contains("%")) {
                    double result = eval(value);
                    soutputTextview.setText(String.valueOf(result));
                } else {
                    try {
                        String[] parts = sinputTextview.getText().toString().split("%");
                        double dividend = Double.parseDouble(parts[0]);
                        double divisor = Double.parseDouble(parts[1]);
                        if (divisor == 0) {
                            Toast.makeText(this, "Division by zero is not allowed.", Toast.LENGTH_SHORT).show();
                        } else {
                            double remainder = dividend % divisor;
                            soutputTextview.setText(String.valueOf(remainder));
                        }
                    } catch (Exception e) {
                        Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    int factorial(int n){
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }

    // nCr function
    public static long calculateCombination(int n, int r) {
        if (n < r || n < 0 || r < 0) {
            throw new IllegalArgumentException("Invalid input. n must be greater than or equal to r, and both must be non-negative.");
        }
        long numerator = factorialNCR(n);
        long denominator = factorialNCR(r) * factorialNCR(n - r);
        return numerator / denominator;
    }
    private static long factorialNCR(int n) {
        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    // nPr function
    public static long calculatePermutation(int n, int r) {
        if (n < r || n < 0 || r < 0) {
            throw new IllegalArgumentException("Invalid input. n must be greater than or equal to r, and both must be non-negative.");
        }
        long numerator = factorialNPR(n);
        long denominator = factorialNPR(n - r);
        return numerator / denominator;
    }
    private static long factorialNPR(int n) {
        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }


    // eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

}