package com.example.s22q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioGroup rgb1;
    RadioButton rb1;
    CheckBox cb1,cb2,cb3,cb4;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgb1=(RadioGroup) findViewById(R.id.radioGroup);
        cb1=(CheckBox) findViewById(R.id.checkBox);
        cb2=(CheckBox) findViewById(R.id.checkBox2);
        cb3=(CheckBox) findViewById(R.id.checkBox3);
        cb4=(CheckBox) findViewById(R.id.checkBox4);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sel_id= rgb1.getCheckedRadioButtonId();
                StringBuilder sb=new StringBuilder();
                rb1=(RadioButton) findViewById(R.id.radioButton);
                if(sel_id==-1)
                    Toast.makeText(getApplicationContext(),"Nothing selected",Toast.LENGTH_LONG).show();
                else
                    sb.append(rb1.getText());

                if(cb1.isChecked())
                    sb.append("C++");
                if(cb2.isChecked())
                    sb.append("DS USING C");
                if(cb3.isChecked())
                    sb.append("C#.NET");
                if(cb4.isChecked())
                    sb.append("JAVA");
                String res=String.valueOf(sb);
                Toast.makeText(getApplicationContext(),res,Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cb1.setChecked(false);
                cb2.setChecked(false);
                cb3.setChecked(false);
                cb4.setChecked(false);
                rb1.setChecked(false);

            }
        });
    }
}