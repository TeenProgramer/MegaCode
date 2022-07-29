package com.kurbonov.megacode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText login,password;
    private Button btn1;
    private TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        func_btn_edit();


    }

    private void init(){
        login=findViewById(R.id.log);
        password=findViewById(R.id.password);
        btn1=findViewById(R.id.btn1);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        String log=login.getText().toString();
        String pas=password.getText().toString();
        if(log=="" && pas==""){
            Toast.makeText(this, "заполните все поля", Toast.LENGTH_SHORT).show();
        }
    }

    private void func_btn_edit() {
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Register.class);
                startActivity(intent );
                Toast.makeText(MainActivity.this, "Успешно выполнено", Toast.LENGTH_SHORT).show();
            }
        });

    }

}