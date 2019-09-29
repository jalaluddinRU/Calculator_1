package com.example.calculator10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1, txt2;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btndot, btnadd, btnsub, btndiv, btnmul, btnequal, btnclear, btnmod, btnpow, btnroot;
    boolean add, sub, mul, div, root, pow, mod;
    Double var1,var2;
    ImageButton buttondelete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(TextView) findViewById(R.id.input);
        txt2=(TextView)findViewById(R.id.result);
        btn0=(Button) findViewById(R.id.button0);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btndot=(Button)findViewById(R.id.buttondot);
        btnadd=(Button)findViewById(R.id.buttonadd);
        btnsub=(Button)findViewById(R.id.buttonsub);
        btndiv=(Button)findViewById(R.id.buttondiv);
        btnmul=(Button)findViewById(R.id.buttonmul);
        btnequal=(Button)findViewById(R.id.buttonequal);
        btnmod=(Button)findViewById(R.id.buttonmod);
        btnpow=(Button)findViewById(R.id.buttonpower);
        btnroot=(Button)findViewById(R.id.buttonroot);
        btnclear=(Button)findViewById(R.id.buttonclear);
        buttondelete=(ImageButton) findViewById(R.id.buttonimage);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"9");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+".");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText()=="")
                    var1 = Double.parseDouble(txt1.getText()+"");
                else
                    var1 = Double.parseDouble(txt2.getText()+"");
                add = true;
                txt1.setText(null);
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText()=="")
                    var1 = Double.parseDouble(txt1.getText()+"");
                else
                    var1 = Double.parseDouble(txt2.getText()+"");
                sub = true;
                txt1.setText(null);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText()=="")
                    var1 = Double.parseDouble(txt1.getText()+"");
                else
                    var1 = Double.parseDouble(txt2.getText()+"");
                mul = true;
                txt1.setText(null);

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText()=="")
                    var1 = Double.parseDouble(txt1.getText()+"");
                else
                    var1 = Double.parseDouble(txt2.getText()+"");
                div = true;
                txt1.setText(null);
            }
        });

        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText()=="")
                    var1 = Double.parseDouble(txt1.getText()+"");
                else
                    var1 = Double.parseDouble(txt2.getText()+"");
                mod = true;
                txt1.setText(null);
            }
        });

        btnroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root = true;
                txt1.setText(null);
            }
        });

        btnpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt2.getText()=="")
                    var1 = Double.parseDouble(txt1.getText()+"");
                else
                    var1 = Double.parseDouble(txt2.getText()+"");
                pow = true;
                txt1.setText(null);
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2=Double.parseDouble(txt1.getText()+"");

                if(add==true){
                    txt1.setText(var1.toString() +"+" + var2.toString());
                    txt2.setText(var1+var2+"");
                    add=false;
                }

                else if(sub==true){
                    txt1.setText(var1.toString() +"-" + var2.toString());
                    txt2.setText(var1-var2+"");
                    sub=false;
                }

                else if(mul==true){
                    txt1.setText(var1.toString() +"x" + var2.toString());
                    txt2.setText(var1*var2+"");
                    mul=false;

                }

                else if(div==true){
                    if(var2==0){
                        txt2.setText("ERROR");
                        txt1.setText(var1.toString() + "/" + var2.toString());
                    }
                    else {
                        txt1.setText(var1.toString() + "/" + var2.toString());
                        txt2.setText(var1 / var2 + "");
                    }
                    div = false;
                }

                else if(mod==true){
                    txt1.setText(var1.toString() +"%" + var2.toString());
                    txt2.setText(var1%var2+"");
                    mod = false;
                }

                else if(root==true){
                    txt1.setText("√" + var2.toString());
                    txt2.setText(Math.sqrt(var2)+"");
                    root = false;
                }

                else if(pow==true){
                    txt1.setText(var1.toString() +"^" + var2.toString());
                    txt2.setText(Math.pow(var1, var2)+"");
                    pow = false;
                }
            }
        });

        buttondelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str =  txt1.getText().toString();
                str = str.substring(0,str.length()-1);
                txt1.setText(str);
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
                txt2.setText("");
                add = sub = mul = div = false;
            }
        });
    }
}
