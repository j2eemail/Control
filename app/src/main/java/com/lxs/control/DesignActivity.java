package com.lxs.control;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lxs.control.design.AppBarLayoutActivity;
import com.lxs.control.design.CollapsingToolbarLayoutActivity;
import com.lxs.control.design.FloatingActionButtonActivity;
import com.lxs.control.design.NavigationViewActiivity;
import com.lxs.control.design.SnackbarActivity;
import com.lxs.control.design.TabLayoutActivity;
import com.lxs.control.design.TextInputLayoutActivity;

/**
 * Created by Administrator on 2017/5/21.
 */

public class DesignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design);
        setTitle(getString(R.string.design_widet));
    }

    public void floatingActionButtonOnClick(View view) {
        startActivity(new Intent(this, FloatingActionButtonActivity.class));
    }

    public void snackBarOnClick(View view) {
        startActivity(new Intent(this, SnackbarActivity.class));
    }

    public void textInputLayoutBarOnClick(View view) {
        startActivity(new Intent(this, TextInputLayoutActivity.class));
    }

    public void tabLayoutBarOnClick(View view) {
        startActivity(new Intent(this, TabLayoutActivity.class));
    }

    public void navigationViewBarOnClick(View view) {
        startActivity(new Intent(this, NavigationViewActiivity.class));
    }

    public void appBarLayoutBarOnClick(View view) {
        startActivity(new Intent(this, AppBarLayoutActivity.class));
    }

    public void collapsingToolbarLayoutBarOnClick(View view) {
        startActivity(new Intent(this, CollapsingToolbarLayoutActivity.class));
    }

}
