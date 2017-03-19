package com.dimentionx.akhileshsh026.tutorialpoint_examples;

import android.speech.tts.Voice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String Msg = "Akhilesh Android : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Msg, " The onCreate: Event ");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(Msg,"the Onstart() event");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(Msg,"This is Onresume event");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(Msg,"This is onPause Event");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(Msg,"This is Ondestroy Event");
    }

    @Override
    protected void onStop()
    {
       super.onStop();
        Log.d(Msg,"This is OnStop() Event");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(Msg,"This is OnRestart() event");
    }
}
