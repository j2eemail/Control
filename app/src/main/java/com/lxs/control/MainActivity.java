package com.lxs.control;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lxs.control.utils.PaletteActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void v4WidgetOnClick(View view) {
        startActivity(new Intent(this, V4Activity.class));
    }

    public void v7WidgetOnClick(View view) {
        startActivity(new Intent(this, V7Activity.class));
    }

    public void designWidetOnClick(View view) {
        startActivity(new Intent(this, DesignActivity.class));
    }

    public void viewOnClick(View view) {
        startActivity(new Intent(this, ViewActivity.class));
    }

    public void PaletteOnClick(View view) {
        startActivity(new Intent(this, PaletteActivity.class));
    }
}
