package com.dimentionx.akhileshsh026.tutorialpoint_examples;

import android.content.Intent;
import android.content.res.Configuration;
import android.speech.tts.Voice;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration config= getResources().getConfiguration();
        android.app.FragmentManager fragmentManager= getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            LM_fragment ls_fragment= new LM_fragment();
            fragmentTransaction.replace(android.R.id.content,ls_fragment);
        }
        else
        {
            PM_fragment pm_fragment = new PM_fragment();
            fragmentTransaction.replace(android.R.id.content,pm_fragment);
        }
        fragmentTransaction.commit();
        setContentView(R.layout.activity_main);
        Log.d("this  is Main", " The onCreate: Event ");


    }

}

