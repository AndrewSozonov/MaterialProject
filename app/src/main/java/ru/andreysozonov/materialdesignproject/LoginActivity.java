package ru.andreysozonov.materialdesignproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    Button buttonLogin;
    TextInputEditText loginEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEditText = findViewById(R.id.editTextLogin);
        buttonLogin = findViewById(R.id.loginButton);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivity(v);
            }
        });
    }

    private void startMainActivity(View view) {
        if (isLoginSuccessfull()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Snackbar.make(view, getString(R.string.enter_login), Snackbar.LENGTH_LONG).show();
        }
    }

    private boolean isLoginSuccessfull() {
        return (!loginEditText.getText().toString().isEmpty());
    }
}
