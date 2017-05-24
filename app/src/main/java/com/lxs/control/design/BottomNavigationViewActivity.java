package com.lxs.control.design;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.lxs.control.R;

/**
 * Created by Administrator on 2017/5/24.
 */

public class BottomNavigationViewActivity extends AppCompatActivity {

    private TextView mTextView;
    private BottomNavigationView mNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_bottomnavigationview);
        setTitle(getString(R.string.BottomNavigationView));
        mTextView = (TextView) findViewById(R.id.text);
        mNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

        mNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        mTextView.setText(item.getTitle().toString().toUpperCase());
                        return true;
                    }
                });
        //显示原有图片颜色
        mNavigationView.setItemIconTintList(null);
    }
}
