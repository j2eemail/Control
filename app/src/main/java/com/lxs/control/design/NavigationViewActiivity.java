package com.lxs.control.design;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lxs.control.R;

/**
 * Android 5.0
 * Created by Administrator on 2017/5/22.
 */
public class NavigationViewActiivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_navigation);
        setTitle(getString(R.string.NavigationView));

        textView = (TextView) findViewById(R.id.content_layout_txt);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation);
        View headView = navigationView.getHeaderView(0);
        ImageView iv = (ImageView) headView.findViewById(R.id.menu_header_image);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("HeaderView ImageView 点击");
                drawerLayout.closeDrawers();
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                textView.setText(item.getTitle() + "点击");
                drawerLayout.closeDrawers();
                return false;
            }
        });
        navigationView.setItemIconTintList(null);
    }
}
