package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GetTextActivity extends AppCompatActivity {

    EditText questionEditText;
    Button countButton;
    TextView wordCountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_text);

        Log.d(getClass().toString(),"onCreate called");

        questionEditText = (EditText)findViewById(R.id.input_text);
        countButton = (Button)findViewById(R.id.count_button);

    }

    public void onWordCountButtonClicked(View button) {
        Log.d(getClass().toString(), "Button was clicked!");
        String input = questionEditText.getText().toString();
        Log.d("Input text was: ", input);
        Intent intent = new Intent(this, WordsCountedActivity.class);   // pass it a class as no instances yet, taken care of by Android not by developer directly
        intent.putExtra("input", input);  //passing (key, value) pair in, like a hash

        startActivity(intent);
    }
}
