package com.lxs.control.v4;

import android.os.Bundle;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lxs.control.R;

/**
 * Created by Administrator on 2017/5/24.
 */

public class SlidingPaneLayoutActivity extends AppCompatActivity {
    private SlidingPaneLayout slidingPaneLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v4_sldingpanelayout);
        setTitle(getString(R.string.SlidingPaneLayout));

        slidingPaneLayout = (SlidingPaneLayout) findViewById(R.id.slidingpanelayout);
//        setSliderFadeColor : 设置主页面的阴影渐变色。即拉出左侧面板时，右边主页面的渐变阴影色，主页面变得越小则阴影色救越浓。阴影色默认为灰色。
//        setCoveredFadeColor : 设置左侧面板缩进去时的阴影渐变色。
//        setPanelSlideListener : 设置左侧面板的拉出监听器。该监听器实现了下面三个方法：
//        onPanelClosed : 左侧面板已关闭。
//        onPanelOpened : 左侧面板已打开。
//        onPanelSlide : 左侧面板在滑动。
//        openPane : 打开左侧面板。
//        closePane : 关闭左侧面板。
//        isOpen : 判断左侧面板是否打开。
        slidingPaneLayout.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {

            }

            @Override
            public void onPanelOpened(View panel) {

            }

            @Override
            public void onPanelClosed(View panel) {

            }
        });

        findViewById(R.id.tv_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slidingPaneLayout.isOpen()) {
                    slidingPaneLayout.closePane();
                } else {
                    slidingPaneLayout.openPane();
                }
            }
        });
    }
}
