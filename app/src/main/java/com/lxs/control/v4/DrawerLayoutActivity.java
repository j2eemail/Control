package com.lxs.control.v4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lxs.control.R;

/**
 * Created by Administrator on 2017/5/24.
 */

public class DrawerLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v4_drawerlayout);
        setTitle(getString(R.string.DrawerLayout));

//        setDrawerShadow : 设置主页面的渐变阴影图形。
//        addDrawerListener : 添加抽屉面板的拉出监听器。该监听器实现了下面三个方法：
//        --onDrawerSlide : 抽屉面板在滑动。
//        --onDrawerOpened : 抽屉面板已打开。
//        --onDrawerClosed : 抽屉面板已关闭。
//        --onDrawerStateChanged : 抽屉面板的状态发生变化。
//        removeDrawerListener : 移除抽屉面板的拉出监听器。
//        closeDrawers : 关闭所有抽屉面板。
//        openDrawer : 打开指定抽屉面板。
//        closeDrawer : 关闭指定抽屉面板。
//        isDrawerOpen : 判断指定抽屉面板是否打开。

    }
}
