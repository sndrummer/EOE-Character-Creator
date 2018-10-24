package edu.cs356.edgeoftheempirecharactercreator.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import edu.cs356.edgeoftheempirecharactercreator.R;

/**
 * Created by jalton on 10/18/18.
 */

public class PreTitle extends AppCompatActivity {

    private ConstraintLayout mPreTitleScreen;
    private boolean mClicked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pre_title);

        mPreTitleScreen = findViewById(R.id.pre_title_screen);

        mPreTitleScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClicked = true;
                proceedToNextScreen();
            }
        });

        new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished){

            }

            public void onFinish(){

                if(!mClicked){
                    proceedToNextScreen();
                }
            }
        }.start();




    }

    private void proceedToNextScreen(){
        //Log.log(Log.Level.DEBUG, this.getClass(), "Starting GameListActivity");
        //Character character = Model.getInstance().getCharacter();

        //character.setCareer(new Smuggler(character));

        Intent intent = new Intent(PreTitle.this, MainScreen.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


}
