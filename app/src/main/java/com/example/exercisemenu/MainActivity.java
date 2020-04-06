package com.example.exercisemenu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editUser, editPw;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUser = (EditText) findViewById(R.id.editUser);
        editPw = (EditText) findViewById(R.id.editPw);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = editUser.getText().toString();
                String passwordKey = editPw.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("123")){
                        Toast.makeText(getApplicationContext(), "Login Sukses",
                                Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Menu.class);
                MainActivity.this.startActivity(intent);
                finish();
                }else {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Usernaem atau Password Anda Salah !")
                        .setNegativeButton("Coba Lagi", null).create().show();
                }
            }
        });
    }
}
