package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void SaveClicked(View view) {

        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText emailEditText = findViewById(R.id.emailEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        EditText passConfirmEditText = findViewById(R.id.passConfirmEditText);

        if (usernameEditText.getText().toString().equals("") || emailEditText.getText().toString().
                equals("") || passwordEditText.getText().toString().equals("") || passConfirmEditText.
                getText().toString().equals("")) {

            Toast.makeText(this, "All fields must be filled.",
                    Toast.LENGTH_SHORT).show();

        } else if (!passConfirmEditText.getText().toString().equals(passwordEditText.getText().
                toString())) {


            Toast.makeText(this, "Error! Passwords don't match. Try again.",
                    Toast.LENGTH_SHORT).show();


        } else {
            Toast.makeText(this, "Welcome, " + usernameEditText.getText().toString() +
                    ", to the SignUpForm App!", Toast.LENGTH_LONG).show();

        }


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
