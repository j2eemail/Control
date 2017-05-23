package com.lxs.control.v4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import com.lxs.control.R;

/**
 * Created by Administrator on 2017/5/21.
 */

public class SpaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v4_space);
        //Space控件是在Android 4.0中加入，是个空白的view，一般用于填充View组件中的间隙。

        setTitle(getString(R.string.Space));
    }
}
