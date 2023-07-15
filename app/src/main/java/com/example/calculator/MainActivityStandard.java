package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityStandard extends AppCompatActivity implements View.OnClickListener {


    Button number1,number2,number3,number4,number5,number6,number7,number8,number9,number0,
            buttAdd,buttSub, buttPercent,buttBrackets,buttClear,ButtMultiply,ButtDivide,
            buttDot,saveBtn,scienBtn,buttRecall,buttEqual;

    Button root, tan, sin, cos, taniv, sininv, cosinv,
            log10, b1ex, in, x1y, b10x, ex, x2, xy, bPm;

    Button remove, binary, deleteT;

    Button rootpt, tanpt, sinpt, cospt, tanivpt, sininvpt, cosinvpt,
            log10pt, b1expt, inpt, x1ypt, b10xpt, expt, x2pt, xypt, bPmpt;

    TextView TextAnswer;
    EditText InputText;

    String process;

   String e = "2.718281828459045";
   SharedPreferences myPrefs=null;
   SharedPreferences.Editor editor;
    boolean findBracket = false;
    TextView invisitext;

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_standard);
        Toast.makeText(getApplicationContext(),"calculator opened",Toast.LENGTH_SHORT).show();


        invisitext = findViewById(R.id.invisibleTV);
        myPrefs=getPreferences(Context.MODE_PRIVATE);
        editor=myPrefs.edit();

        deleteT = findViewById(R.id.toDec);
        deleteT.setOnClickListener(this);

        binary =  findViewById(R.id.binaryCon);
        binary.setOnClickListener(this);

        remove = findViewById(R.id.clearSave);
        remove.setOnClickListener(this);

        InputText = findViewById(R.id.TextViewInput);
        TextAnswer = findViewById(R.id.textViewAnswer);


        buttClear = findViewById(R.id.buttonC);
        buttClear.setOnClickListener(this);

        buttRecall = findViewById(R.id.recallBtn);
        buttRecall.setOnClickListener(this);

        saveBtn = findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(this);

        scienBtn = findViewById(R.id.scientific);
        scienBtn.setOnClickListener(this);



        number0 = findViewById(R.id.button0);
        number0.setOnClickListener(this);

        number1 = findViewById(R.id.button1);
        number1.setOnClickListener(this);

        number2 = findViewById(R.id.button2);
        number2.setOnClickListener(this);

        number3 = findViewById(R.id.button3);
        number3.setOnClickListener(this);

        number4 = findViewById(R.id.button4);
        number4.setOnClickListener(this);

        number5 = findViewById(R.id.button5);
        number5.setOnClickListener(this);

        number6 = findViewById(R.id.button6);
        number6.setOnClickListener(this);

        number7 = findViewById(R.id.button7);
        number7.setOnClickListener(this);

        number8 = findViewById(R.id.button8);
        number8.setOnClickListener(this);

        number9 = findViewById(R.id.button9);
        number9.setOnClickListener(this);

        buttEqual = findViewById(R.id.buttonEql);
        buttEqual.setOnClickListener(this);

        //symbols

        buttAdd = findViewById(R.id.buttonAdd);
        buttAdd.setOnClickListener(this);

        buttSub = findViewById(R.id.buttonSub);
        buttSub.setOnClickListener(this);

        buttBrackets = findViewById(R.id.buttonBrakets);
        buttBrackets.setOnClickListener(this);

        ButtMultiply = findViewById(R.id.buttonMult);
        ButtMultiply.setOnClickListener(this);

        buttPercent = findViewById(R.id.buttonMod);
        buttPercent.setOnClickListener(this);

        ButtDivide = findViewById(R.id.buttonDevide);
        ButtDivide.setOnClickListener(this);

        buttDot = findViewById(R.id.buttonPointSc);
        buttDot.setOnClickListener(this);

        root = findViewById(R.id.button12);
        root.setOnClickListener(this);

        tan = findViewById(R.id.button16);
        tan.setOnClickListener(this);

        cos = findViewById(R.id.button15);
        cos.setOnClickListener(this);

        bPm = findViewById(R.id.button13);
        bPm.setOnClickListener(this);

        sin = findViewById(R.id.button14);
        sin.setOnClickListener(this);

        taniv = findViewById(R.id.button11);
        taniv.setOnClickListener(this);

        cosinv = findViewById(R.id.button10);
        cosinv.setOnClickListener(this);

        sininv = findViewById(R.id.button);
        sininv.setOnClickListener(this);

        x1y = findViewById(R.id.button17);
        x1y.setOnClickListener(this);

        in = findViewById(R.id.button18);
        in.setOnClickListener(this);

        log10 = findViewById(R.id.button19);
        log10.setOnClickListener(this);

        b1ex = findViewById(R.id.button20);
        b1ex.setOnClickListener(this);

        b10x = findViewById(R.id.button21);
        b10x.setOnClickListener(this);

        ex = findViewById(R.id.button22);
        ex.setOnClickListener(this);

        x2 = findViewById(R.id.button23);
        x2.setOnClickListener(this);

        xy = findViewById(R.id.button24);
        xy.setOnClickListener(this);

        //pt functions

        rootpt = findViewById(R.id.ptsqrt);
        rootpt.setOnClickListener(this);

        tanpt = findViewById(R.id.pttan);
        tanpt.setOnClickListener(this);

        sinpt = findViewById(R.id.ptsin);
        sinpt.setOnClickListener(this);

        rootpt = findViewById(R.id.ptsqrt);
        rootpt.setOnClickListener(this);

        cospt = findViewById(R.id.ptcos);
        cospt.setOnClickListener(this);

        rootpt = findViewById(R.id.ptsqrt);
        rootpt.setOnClickListener(this);

        tanivpt = findViewById(R.id.pttan1);
        tanivpt.setOnClickListener(this);

        sininvpt = findViewById(R.id.ptsin1);
        sininvpt.setOnClickListener(this);

        cosinvpt = findViewById(R.id.ptcos1);
        cosinvpt.setOnClickListener(this);

        log10pt = findViewById(R.id.ptlog10);
        log10pt.setOnClickListener(this);

        b1expt = findViewById(R.id.pt1x);
        b1expt.setOnClickListener(this);

        rootpt = findViewById(R.id.ptsqrt);
        rootpt.setOnClickListener(this);

        inpt = findViewById(R.id.ptin);
        inpt.setOnClickListener(this);

        x1ypt = findViewById(R.id.ptxoney);
        x1ypt.setOnClickListener(this);

        b10xpt = findViewById(R.id.pt10x);
        b10xpt.setOnClickListener(this);

        expt = findViewById(R.id.ptex);
        expt.setOnClickListener(this);

        x2pt = findViewById(R.id.ptx2);
        x2pt.setOnClickListener(this);

        xypt = findViewById(R.id.ptxy);
        xypt.setOnClickListener(this);

        bPmpt = findViewById(R.id.ptpm);
        bPmpt.setOnClickListener(this);

        hideKeys(InputText);
    }

    private void hideKeys(EditText inputText) {
        InputMethodManager manager = (InputMethodManager) getSystemService(
                Context.INPUT_METHOD_SERVICE
        );
        manager.hideSoftInputFromWindow(InputText.getApplicationWindowToken()
            ,0
        );
    }

    /*the next method is the on click which is used to iput text on to our text view and calculate functions*/
    @SuppressLint({"NonConsteantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View v) {

        int value = v.getId();

        if (value == R.id.buttonC) {
            clearMethod();
        }else if(value == R.id.TextViewInput){
            hideKeys(InputText);
        }else if (value == R.id.button0) {
            process = InputText.getText().toString();
            InputText.setText(process + "0");
        } else if (value == R.id.button1) {
            process = InputText.getText().toString();
            InputText.setText(process + "1");
        } else if (value == R.id.button2) {
            process = InputText.getText().toString();
            InputText.setText(process + "2");
        } else if (value == R.id.button3) {
            process = InputText.getText().toString();
            InputText.setText(process + "3");
        } else if (value == R.id.button4) {
            process = InputText.getText().toString();
            InputText.setText(process + "4");
        } else if (value == R.id.button5) {
            process = InputText.getText().toString();
            InputText.setText(process + "5");
        } else if (value == R.id.button6) {
            process = InputText.getText().toString();
            InputText.setText(process + "6");
        } else if (value == R.id.button7) {
            process = InputText.getText().toString();
            InputText.setText(process + "7");
        } else if (value == R.id.button8) {
            process = InputText.getText().toString();
            InputText.setText(process + "8");
        } else if (value == R.id.button9) {//setNumber9();
            process = InputText.getText().toString();
            InputText.setText(process + "9");
        } else if (value == R.id.buttonAdd) {//setNumber9();
            process = InputText.getText().toString();
            if(InputText.length()==0){
                InputText.setText(process + "");
            }else {
                InputText.setText(process + "+");
            }
        } else if (value == R.id.buttonSub) {
            process = InputText.getText().toString();
            if(InputText.length()==0){
                InputText.setText(process + "");
            }else {
                InputText.setText(process + "-");
            }
        } else if (value == R.id.buttonMult) {
            process = InputText.getText().toString();
            if(InputText.length()==0){
                InputText.setText(process + "");
            }else {
                InputText.setText(process + "×");
            }
        } else if (value == R.id.buttonDevide) {
            process = InputText.getText().toString();
            if(InputText.length()==0){
                InputText.setText(process + "");
            }else {
                InputText.setText(process + "÷");
            }
        } else if (value == R.id.buttonMod) {

            process = InputText.getText().toString();

            if(InputText.length()==0){
                InputText.setText(process + "");
            }else {
                InputText.setText(process + "/100");
            }
        } else if (value == R.id.buttonPointSc) {
            process = InputText.getText().toString();
            if(InputText.length()==0){
                InputText.setText(process + "0.");
            }else {
                InputText.setText(process + ".");
            }
        } else if (value == R.id.buttonBrakets) {
            if (findBracket) {
                process = InputText.getText().toString();
                InputText.setText(process + ")");
                findBracket = false;
            } else {
                process = InputText.getText().toString();
                InputText.setText(process + "(");
                findBracket = true;
            }
        } else if (value == R.id.scientific) {
            Intent intent = new Intent(this, MainActivitySettings.class);
            startActivity(intent);
        } else if (value == R.id.buttonEql) {

            if (InputText.length()==0){
                Toast.makeText(getApplicationContext(),"Please enter a value",Toast.LENGTH_SHORT).show();
            }else {
                setButtEqual();
            }
        } else if (value == R.id.button12 || value == R.id.ptsqrt) {
            process = InputText.getText().toString();
            InputText.setText(process + "sqrt");
        } else if (value == R.id.button16 || value == R.id.pttan) {
            process = InputText.getText().toString();
            InputText.setText(process + "tan(");
        } else if (value == R.id.button15 || value == R.id.ptcos) {
            process = InputText.getText().toString();
            InputText.setText(process + "cos(");
        } else if (value == R.id.button14 || value == R.id.ptsin) {
            process = InputText.getText().toString();
            InputText.setText(process + "sin(");
        } else if (value == R.id.button13 || value == R.id.ptpm) {
            process = InputText.getText().toString();
            InputText.setText(process + "(-");
        } else if (value == R.id.button11 || value == R.id.pttan1) {
            process = InputText.getText().toString();
            InputText.setText(process + "atan(");
        } else if (value == R.id.button10 || value == R.id.ptcos1) {
            process = InputText.getText().toString();
            InputText.setText(process + "acos(");
        } else if (value == R.id.button || value == R.id.ptsin1) {
            process = InputText.getText().toString();
            InputText.setText(process + "asin(");
        } else if (value == R.id.button17 || value == R.id.ptxoney) {
            process = InputText.getText().toString();

            if(InputText.length()==0){
                InputText.setText(process + "0^(1/");
            }else {
                InputText.setText(process + "^(1/");
            }
        } else if (value == R.id.button18 || value == R.id.ptin) {
            process = InputText.getText().toString();
            InputText.setText(process + "ln");
        } else if (value == R.id.button19 || value == R.id.ptlog10) {
            process = InputText.getText().toString();
            InputText.setText(process + "log");
        } else if (value == R.id.button20 || value == R.id.pt1x) {
            process = InputText.getText().toString();
            InputText.setText(process + "1/");
        } else if (value == R.id.button21 || value == R.id.pt10x) {
            process = InputText.getText().toString();
            InputText.setText(process + "10^(");
        } else if (value == R.id.button22 || value == R.id.ptex) {
            process = InputText.getText().toString();
            InputText.setText(process + e + "^(");


        } else if (value == R.id.button23 || value == R.id.ptx2) {
            process = InputText.getText().toString();

            if (InputText.length() == 0) {
                InputText.setText(process + "0^(2)");
            }else{
                InputText.setText(process + "^(2)");
            }

        } else if (value == R.id.button24 || value == R.id.ptxy) {
            process = InputText.getText().toString();

            if (InputText.length() == 0){
                InputText.setText(process + "0^");
            }else {
                InputText.setText(process + "^");
            }
        }else if(value == R.id.recallBtn){
            recallMethod();
        }else if(value == R.id.saveBtn){
            saveAnswer();
        }else if(value == R.id.clearSave){
            resetMethod();
        }else if(value == R.id.binaryCon){
            TextAnswer.setText(toBinary());
        }else if(value == R.id.toDec){
           doBackSpace();
        }else {
            Toast.makeText(getApplicationContext(), "illegal statement", Toast.LENGTH_SHORT).show();
            throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    private void doBackSpace(){
        String value = InputText.getText().toString();
        int input = value.length();
        if (input > 0){
            InputText.setText(value.substring(0, input - 1 ));
        }else {
            InputText.setText("");
        }
    }

    private void setButtEqual() {

            String value = InputText.getText().toString();
            String NewString = value.replace('÷', '/').replace('×', '*');
            double result = evaluate(NewString);
            TextAnswer.setText(String.valueOf(result));
            InputText.setText(value);

    }
//Method to clear text from all views
    private void clearMethod() {
        InputText.setText("");
        TextAnswer.setText("");
    }

    public void saveAnswer(){
        String save;
        save = TextAnswer.getText().toString();
        invisitext.setText(String.valueOf(save));
    }

    //this is the recall
    //used to recall saved values
    @SuppressLint("SetTextI18n")
    public void recallMethod(){
        process = InputText.getText().toString();
        String save;
        save = invisitext.getText().toString();
        InputText.setText(process + save);
    }
    public void resetMethod(){
        InputText.setText(" ");
        invisitext.setText(" ");

    }

//    public  String toDecimal(){
//        String answer;
//        String s = InputText.getText().toString();
//        answer = Long.toBinaryString(Long.parseLong(s));
//        return answer;
//    }

    //this is the method used to convert from decimal 10 to binary
    public String toBinary(){
        String answer;
        String s = InputText.getText().toString();
        answer = Integer.toBinaryString(Integer.parseInt(s));//makes use of the .tobinary method
       return answer;
    }

    ///********************************************************///
    //this is the evall function which calculates mathematical functions
    public static double evaluate(final String str) {
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
          /*  expression = term | expression `+` term | expression `-` term
            term = factor | term `*` factor | term `/` factor
            factor = `+` factor | `-` factor | `(` expression `)`
            | number | functionName factor | factor `^` factor*/

            double parseExpression() {// used to pars value x that contain a term "+, -"
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {// used to pars value x that contain a term "*, /"
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {// the parsFactor method takes values to be processed  and it has a return type of double
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
                    switch (func) { // the switch block is used to identify the function from the math class to use for the processing of the value x
                        case "sqrt":
                            x = Math.sqrt(x);
                            break;
                        case "sin":
                            x = Math.sin(Math.toRadians(x));
                            break;
                        case "cos":
                            x = Math.cos(Math.toRadians(x));
                            break;
                        case "tan":
                            x = Math.tan(Math.toRadians(x));
                            break;
                        case "log":
                            x = Math.log10(x);
                            break;
                        case "ln":
                            x = Math.log(x);
                            break;
                        case "asin":
                            x = Math.asin(Math.toRadians(x));
                            break;
                        case "atan":
                            x = Math.atan(Math.toRadians(x));
                            break;
                        case "acos":
                            x = Math.acos(Math.toRadians(x));
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);

                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}