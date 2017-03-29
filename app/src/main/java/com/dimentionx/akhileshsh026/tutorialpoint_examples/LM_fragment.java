package com.dimentionx.akhileshsh026.tutorialpoint_examples;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Akhileshsh026 on 28-03-2017.
 */

public class LM_fragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lm_fragment,container,false);
    }
}
