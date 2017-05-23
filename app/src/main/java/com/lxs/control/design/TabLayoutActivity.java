package com.lxs.control.design;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import com.lxs.control.R;

/**
 * Android 5.0
 * Created by Administrator on 2017/5/22.
 */

public class TabLayoutActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private TabLayout tabLayout1;
    private TabLayout tabLayout2;
    private String[] title = new String[]{"Title1", "Title2", "Title3"};
    private int[] titleImg = new int[]{R.mipmap.tab1, R.mipmap.tab2, R.mipmap.tab3};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_tablayout);
        setTitle(getString(R.string.TabLayout));

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        tabLayout1 = (TabLayout) findViewById(R.id.tablayout_id1);
        tabLayout2 = (TabLayout) findViewById(R.id.tablayout_id2);

        //设置TabLayout的模式
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        //为TabLayout添加tab名称
        for (String s : title) {
            tabLayout.addTab(tabLayout.newTab().setText(s));
        }

        for (Integer i : titleImg) {
            tabLayout1.addTab(tabLayout1.newTab().setIcon(i));
        }

        for (int i = 0; i < title.length; i++) {
            tabLayout2.addTab(tabLayout2.newTab().setText(title[i]).setIcon(titleImg[i]));
        }

//        tabLayout2.getTabAt(i).setCustomView()可以设置自定义布局
    }
}
