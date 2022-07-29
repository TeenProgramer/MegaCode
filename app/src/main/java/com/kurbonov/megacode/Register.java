package com.kurbonov.megacode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {


    private EditText login_1,password_1,code_from_email;
    private Button btn1;
    private TextView email_check1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
        check_acc();

    }

    private void init(){
        login_1=findViewById(R.id.login_1);
        password_1=findViewById(R.id.password_1);
        btn1=findViewById(R.id.button);
        email_check1=findViewById(R.id.email_check);
        code_from_email=findViewById(R.id.code_from_email);
        String login=login_1.getText().toString();
        String password=password_1.getText().toString();
        String chec_code=code_from_email.getText().toString();
    }

    private void check_acc() {
        email_check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here we must send code which we generate to email
                //if code which we sent==chec_code than do somthing
            }
        });
    }


}