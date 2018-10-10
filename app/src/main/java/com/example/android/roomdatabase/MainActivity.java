package com.example.android.roomdatabase;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private EditText inputText;
    private TextView addedText;

    public void buttonOnClick (View view){
        Button button = (Button) view;
        inputText =  (EditText) findViewById(R.id.edit_text_view);
        addedText= (TextView) findViewById(R.id.room_textview);

        addedText.setText(inputText.getText());
    }

    ListDatabase list = Room.databaseBuilder(getApplicationContext(),
            ListDatabase.class, "my-interesting-list").build();
}

