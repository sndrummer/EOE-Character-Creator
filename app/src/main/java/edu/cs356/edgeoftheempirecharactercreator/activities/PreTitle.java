package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import edu.cs356.edgeoftheempirecharactercreator.R;

/**
 * Created by jalton on 10/18/18.
 */

public class PreTitle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pre_title);

        new CountDownTimer(7000, 1000) {
            public void onTick(long millisUntilFinished){

            }

            public void onFinish(){
                proceedToNextScreen();
            }
        }.start();
    }

    private void proceedToNextScreen(){
        //Log.log(Log.Level.DEBUG, this.getClass(), "Starting GameListActivity");
        //Character character = Model.getInstance().getCharacter();

        //character.setCareer(new Smuggler(character));

        Intent intent = new Intent(PreTitle.this, MainScreen.class);

        startActivity(intent);
    }
}
