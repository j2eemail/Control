package com.lxs.control.design;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lxs.control.R;
import com.lxs.control.v7.RecycleViewDivider;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Android 5.0
 * Created by Administrator on 2017/5/21.
 */

public class FloatingActionButtonActivity extends AppCompatActivity {
    //https://github.com/wzwosprey/FloatingActionsMenuDemo菜单

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_floatingactionbutton);
        setTitle(getString(R.string.FloatingActionButton));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.fab_recyclerview);
        //创建一个线性的布局管理器并设置
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new RecycleViewDivider(
                this, LinearLayoutManager.HORIZONTAL, 2, ContextCompat.getColor(this, R.color.Cyan)));
        recyclerView.setAdapter(new CommonAdapter<String>(this, R.layout.v7_recyclerview_item, getData()) {
            @Override
            protected void convert(ViewHolder holder, String s, int position) {

            }

            @Override
            public void convert(ViewHolder holder, String s) {
                holder.setText(R.id.recyclerview_item_txt, s);
            }
        });

    }


    private List<String> getData() {
        List<String> data = new ArrayList<String>();
        for (int i = 0; i < 40; i++) {
            data.add("测试数据" + i);
        }
        return data;
    }
}
