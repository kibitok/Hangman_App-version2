package com.example.simanste.hangmangame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_ID = "com.example.hangmangame.ID";
// public static final String EXTRA_GAME_REC =  "com.example.hangmangame.GAME_REC";
 //All add up to 30points
//TODO welcome to hangmangame resolve all errors in this project (i.e correct ids etc) (15 points)
//TODO rename this project to hangmangame (2 point)
//TODO Change the application launcher icon to your own custom image (3 points)
//TODO Push the project to github and submit the links by Saturday 18th Aug (include apk file and screenshots) (3 points)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView title = (TextView) findViewById(R.id.title);
        String titleText = "HANGMAN";
        title.setText(titleText);

    }

    public void playGameButtonClick(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        //create record

        //get playerID
        String playerID = editText.getText().toString().toUpperCase();
        //TODO send playerID to the PlayGame activity with EXTRA_ID as the key (use intents) (6 points)
        Intent intent= new Intent( getBaseContext(),PlayGame.class );
        intent.putExtra(EXTRA_ID, playerID);
        startActivity( intent );
    }
}
