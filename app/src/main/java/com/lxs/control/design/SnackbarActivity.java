package com.lxs.control.design;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.lxs.control.R;

/**
 * Android 5.0
 * Created by Administrator on 2017/5/22.
 */

public class SnackbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_snackbar);
        setTitle(getString(R.string.Snackbar));
    }

    public void defaultSnackBarOnClick(View view) {
        Snackbar.make(view, "默认的Snackbar", Snackbar.LENGTH_LONG)
                .setAction("点击", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SnackbarActivity.this, "Snackbar 点击提示", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }

    public void stylesSnackBarOnClick(View view) {
        Snackbar snackbar = Snackbar.make(view, "更改样式的", Snackbar.LENGTH_SHORT);
        Snackbar.SnackbarLayout barlayout = (Snackbar.SnackbarLayout) snackbar.getView();
        //更换背景色
        barlayout.setBackgroundColor(ContextCompat.getColor(this, R.color.Grey));
        //更换字体颜色
        ((TextView) barlayout.findViewById(R.id.snackbar_text)).setTextColor(ContextCompat.getColor(this, R.color.Green));
        snackbar.setActionTextColor(ContextCompat.getColor(this, R.color.Red));
        //设置事件
        snackbar.setAction("点击", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SnackbarActivity.this, "Snackbar 点击提示", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }

    Snackbar snackbar;
    public void customSnackBarOnClick(View view) {
        snackbar = Snackbar.make(view, "自定义", Snackbar.LENGTH_SHORT);
        View snackbarview = snackbar.getView();//获取snackbar的View(其实就是SnackbarLayout)
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbarview;//将获取的View转换成SnackbarLayout
        View add_view = LayoutInflater.from(snackbarview.getContext()).inflate(R.layout.item_01, null);//加载布局文件新建View
        ((TextView)add_view.findViewById(R.id.item_txt)).setText("测试");
        add_view.findViewById(R.id.item_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);//设置新建布局参数
        p.gravity = Gravity.CENTER_VERTICAL;//设置新建布局在Snackbar内垂直居中显示
        snackbarLayout.addView(add_view, 0, p);//将新建布局添加进snackbarLayout相应位置
        snackbar.show();
    }
}
