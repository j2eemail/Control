package com.lxs.control.v7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.lxs.control.R;

/**
 * Created by Administrator on 2017/5/21.
 */

public class GridLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v7_gridlayout);
        //GridLayout是在Android4.0中引进的新布局,减少布局嵌套层次从而提高性能；针对需要复杂对齐的布局

        setTitle(getString(R.string.GridLayout));


    }

    public void imageOnClick(View view) {
        Toast.makeText(this, "点击", Toast.LENGTH_SHORT).show();
    }
}
