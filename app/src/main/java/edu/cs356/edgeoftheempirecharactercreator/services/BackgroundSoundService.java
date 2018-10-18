package edu.cs356.edgeoftheempirecharactercreator.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import edu.cs356.edgeoftheempirecharactercreator.R;

/**
 * Created by jalton on 10/18/18.
 */

public class BackgroundSoundService extends Service {

    private static final String TAG = "BackgroundMusic";
    private static MediaPlayer mPlayer;
    private boolean playMusic;
    int mPos = 0;
    public IBinder onBind(Intent arg0) {

        return null;
    }
    @Override
    public void onCreate() {
        if(mPlayer == null) {
            mPlayer = MediaPlayer.create(this, R.raw.title);
            mPlayer.setLooping(false); // Set looping
            mPlayer.setVolume(100, 100);
        }
        playMusic = true;
    }

    public int onStartCommand(Intent intent, int flags, int startId) {

        if(playMusic) {

            if (intent.getAction().equals("PLAY")) {
                if (!mPlayer.isPlaying()) mPlayer.start();
            } else if (intent.getAction().equals("PAUSE")) {
                if (mPlayer.isPlaying()) {
                    mPos = mPlayer.getCurrentPosition();
                    mPlayer.pause();
                }
            } else if (intent.getAction().equals("RESUME")) {
                if (!mPlayer.isPlaying()) {
                    mPlayer.start();
                    mPlayer.seekTo(mPos);
                }
            } else if (intent.getAction().equals("MUTE")) {
                playMusic = false;
                mPlayer.stop();
                mPlayer.release();
            }
        }
        else if (intent.getAction().equals("UNMUTE")) {
            playMusic = true;
            mPlayer = MediaPlayer.create(this, R.raw.title);
            mPlayer.setLooping(false); // Set looping
            mPlayer.setVolume(100, 100);
            mPlayer.start();
        }

        return Service.START_STICKY;
    }



    public IBinder onUnBind(Intent arg0) {
        // TODO Auto-generated method stub

        return null;
    }


    @Override
    public void onDestroy() {

        mPlayer.stop();
        mPlayer.release();
    }

    @Override
    public void onLowMemory() {

    }
}
