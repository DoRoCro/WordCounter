package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WordsCountedActivity extends AppCompatActivity {

    TextView inputText;
    TextView wordsCountedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_counted);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();                   //retrieve parameters from intent
        String input = extras.getString("input");       // get object via key

        inputText = (TextView)findViewById(R.id.input_text);
        inputText.setText(input);
        wordsCountedText = (TextView)findViewById(R.id.words_counted);

        long wordcount = WordCounter.wordCount(input);
        wordsCountedText.setText("There are " + wordcount + " words.");
    }
}
