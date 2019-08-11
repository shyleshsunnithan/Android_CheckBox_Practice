package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox check1,check2,check3;
    private Button button_sel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerToCheckBox();
    }

    public void addListenerToCheckBox(){
        check1 = (CheckBox)findViewById(R.id.checkBox);
        check2 = (CheckBox)findViewById(R.id.checkBox2);
        check3 = (CheckBox)findViewById(R.id.checkBox3);
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this,"Good Boy is Checked",Toast.LENGTH_LONG).show();
                }
            }
        });

        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this,"Bad Boy is Checked",Toast.LENGTH_LONG).show();
                }
            }
        });

        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this,"Handsome is Checked",Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    public void addListenerOnButton(){

        check1 = (CheckBox)findViewById(R.id.checkBox);
        check2 = (CheckBox)findViewById(R.id.checkBox2);
        check3 = (CheckBox)findViewById(R.id.checkBox3);
        button_sel = (Button)findViewById(R.id.button);

        button_sel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("Good Boy : ").append(check1.isChecked());
                result.append("\n Bad Boy : ").append(check2.isChecked());
                result.append("\n Handsome : ").append(check3.isChecked());
                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();;

            }
        });

    }
}
