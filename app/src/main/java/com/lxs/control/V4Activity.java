package com.lxs.control;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lxs.control.v4.*;

/**
 * Created by Administrator on 2017/5/21.
 */

public class V4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v4layout);

        setTitle(getString(R.string.v4_widget));
    }

    public void spaceOnClick(View view) {
        startActivity(new Intent(this, SpaceActivity.class));
    }

    public void swipeRefreshLayoutOnClick(View view) {
        startActivity(new Intent(this, SwipeRefreshLayoutActivity.class));
    }

    public void slidingPaneLayoutOnClick(View view) {
        startActivity(new Intent(this, SlidingPaneLayoutActivity.class));
    }

    public void drawerLayoutOnClick(View view) {
        startActivity(new Intent(this, DrawerLayoutActivity.class));
    }

}
