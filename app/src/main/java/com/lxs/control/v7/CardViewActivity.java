package com.lxs.control.v7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lxs.control.R;

/**
 * Android 5.0
 * Created by Administrator on 2017/5/21.
 */

public class CardViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v7_cardview);
        setTitle(getString(R.string.CardView));
    }
}
