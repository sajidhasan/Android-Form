package net.sajidhasan.www.experiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "net.sajidhasan.experiment.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*this function is called when user taps the send button
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    */
    public void showDetails(View view){
        String details = "Hello";

        Intent intent = new Intent(this, DisplayDetailsActivity.class);
        EditText firstName = (EditText) findViewById(R.id.editText2);
        EditText lastName = (EditText) findViewById(R.id.editText4);
        EditText email = (EditText) findViewById(R.id.editText5);
        EditText phone = (EditText) findViewById(R.id.editText6);

        details += " " + firstName.getText().toString() + " "
                        + lastName.getText().toString() + "! "
                + "Your email is " + email.getText().toString() + ". "
                + "Phone: " + phone.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, details);
        startActivity(intent);
    }
}
