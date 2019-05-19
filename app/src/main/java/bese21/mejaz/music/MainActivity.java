package bese21.mejaz.music;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    //TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSSoundId;
    private int mDSSoundId;
    private int mESSoundId;
    private int mFSSoundId;
    private int mGSSoundId;
    private int mASSoundId;
    private int mBSSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //TODO: Create a new SoundPool
    //SoundPool(maxStreams, streamType, srcQuality)
         mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);


    //TODO: Load and get the IDs to identify the sound
    //mSoundId = mSoundPool.load(context, resId, priority)

        mCSSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c ,1);
        mDSSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d ,1);
        mESSoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e ,1);
        mFSSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f ,1);
        mGSSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g ,1);
        mASSoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a ,1);
        mBSSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b ,1);

    }

    //TODO: Add the play methods triggered by the buttons
    //mSoundPool.play(soundID, leftVolume, rightVolume, priority, loop, play-rate);

    public void playC(View v){
        Log.d("Music", "Red is clicked for playC: ");
        mSoundPool.play(mCSSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP , NORMAL_PLAY_RATE);
    }
    public void playD(View v){
        Log.d("Music", "orange is clicked for playD: ");
        mSoundPool.play(mDSSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP , NORMAL_PLAY_RATE);

    }
    public void playE(View v){
        Log.d("Music", "yellow is clicked for playE: ");
        mSoundPool.play(mESSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP , NORMAL_PLAY_RATE);
    }
    public void playF(View v){
        Log.d("Music", "light green is clicked for playF: ");
        mSoundPool.play(mFSSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP , NORMAL_PLAY_RATE);
    }
    public void playG(View v){
        Log.d("Music", "dark green is clicked for playG: ");
        mSoundPool.play(mGSSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP , NORMAL_PLAY_RATE);
    }
    public void playA(View v){
        Log.d("Music", "blue is clicked for playA: ");
        mSoundPool.play(mASSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP , NORMAL_PLAY_RATE);
    }
    public void playB(View v){
        Log.d("Music", "purple is clicked for playB: ");
        mSoundPool.play(mBSSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY,NO_LOOP , NORMAL_PLAY_RATE);
    }
}
