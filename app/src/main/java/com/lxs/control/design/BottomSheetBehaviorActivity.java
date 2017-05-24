package com.lxs.control.design;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lxs.control.R;

/**
 * Created by Administrator on 2017/5/24.
 */

public class BottomSheetBehaviorActivity extends AppCompatActivity {

    private BottomSheetBehavior behavior;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_bottomsheetbehavior);
        setTitle(getString(R.string.BottomSheetBehavior));

        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.cl);
        View bottomSheet = coordinatorLayout.findViewById(R.id.bottom_sheet);
        behavior = BottomSheetBehavior.from(bottomSheet);
//        from : 从指定视图获取底部弹窗行为。
//        getState : 获取该行为的状态。
//        setState : 设置该行为的状态。取值STATE_EXPANDED表示完全展开；取值STATE_COLLAPSED表示折叠；取值STATE_HIDDEN表示隐藏。
//        setPeekHeight : 设置弹窗的预览高度，即setState取值STATE_COLLAPSED时设定的折叠高度。
//        setHideable : 设置弹窗是否允许隐藏。
//        setBottomSheetCallback来实现，onSlide方法是拖拽中的回调，根据slideOffset可以做一些动画
//        onStateChanged方法可以监听到状态的改变,总共有5种
        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                //这里是bottomSheet 状态的改变，根据slideOffset可以做一些动画
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                //这里是拖拽中的回调，根据slideOffset可以做一些动画
            }
        });
    }

    public void btnOnClick(View view) {
//        STATE_COLLAPSED: 关闭Bottom Sheets,显示peekHeight的高度，默认是0
//        STATE_DRAGGING: 用户拖拽Bottom Sheets时的状态
//        STATE_SETTLING: 当Bottom Sheets view摆放时的状态。
//        STATE_EXPANDED: 当Bottom Sheets 展开的状态
//        STATE_HIDDEN: 当Bottom Sheets 隐藏的状态
        if (behavior.getState() == BottomSheetBehavior.STATE_EXPANDED) {
            behavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        } else {
            behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        }
    }
}
