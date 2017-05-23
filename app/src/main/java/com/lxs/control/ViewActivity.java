package com.lxs.control;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.lxs.control.view.RippleDrawableActivity;
import com.lxs.control.view.TextureViewActivity;

/**
 * Created by Administrator on 2017/5/21.
 */

public class ViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.viewlayout);
        setTitle(getString(R.string.view_bao));
    }

    public void textureViewOnClick(View view) {
        startActivity(new Intent(this, TextureViewActivity.class));
    }

    public void rippleDrawableOnClick(View view) {
        startActivity(new Intent(this, RippleDrawableActivity.class));
    }

}
