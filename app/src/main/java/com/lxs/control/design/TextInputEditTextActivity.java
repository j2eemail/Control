package com.lxs.control.design;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lxs.control.R;

/**
 * Created by Administrator on 2017/5/23.
 */

public class TextInputEditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_textinputedittext);
        setTitle(getString(R.string.TextInputEditText));

    }
}
