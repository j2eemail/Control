package com.lxs.control;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lxs.control.v7.*;

/**
 * Created by Administrator on 2017/5/21.
 */

public class V7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v7layout);

        setTitle(getString(R.string.v7_widet));
    }

    public void gridLayoutOnClick(View view) {
        startActivity(new Intent(this, GridLayoutActivity.class));
    }

    public void switchCompatOnClick(View view) {
        startActivity(new Intent(this, SwitchCompatActivity.class));
    }

    public void popupMenuOnClick(View view) {
        startActivity(new Intent(this, PopupMenuActivity.class));
    }

    public void cardViewOnClick(View view) {
        startActivity(new Intent(this, CardViewActivity.class));
    }

    public void toolbarOnClick(View view) {
        startActivity(new Intent(this, ToolbarActivity.class));
    }

    public void recyclerViewOnClick(View view) {
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }

}
