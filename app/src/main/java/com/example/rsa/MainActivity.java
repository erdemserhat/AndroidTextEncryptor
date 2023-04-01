package com.example.rsa;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rsa.crypto.Rsa;
import com.example.rsa.crypto.TextChiper;
import com.google.android.material.textfield.TextInputEditText;
public class MainActivity extends AppCompatActivity {

    TextInputEditText messageText;
    TextInputEditText chiperText;
    TextView info;

    com.example.rsa.crypto.TextChiper tc = new TextChiper(new Rsa());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageText = findViewById(R.id.message_text);
        chiperText = findViewById(R.id.chiper_text);
        info = findViewById(R.id.info_text);

    }

    public void encrypt(View view){
        info.setText("Şifreleniyor, lütfen bekleyiniz...");
        String message = messageText.getText().toString();
        chiperText.setText(tc.encryptText(message));
        info.setText("Şifreleme İşlemi Başarılı...");


    }

    public void decrypt(View view){
        info.setText("Şifre çözülüyor, biraz zaman alabilir...");
        String chiperText = this.chiperText.getText().toString();
        messageText.setText(tc.decryptText(chiperText));
        info.setText("Şifre Çözme İşlemi Başarılı");

    }

}