package com.lxs.control.design;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.lxs.control.R;

/**
 * Created by Administrator on 2017/5/24.
 */

public class SwipeDismissBehaviorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_swipedismissbehavior);
        setTitle(getString(R.string.SwipeDismissBehavior));

        TextView swipeView = (TextView) findViewById(R.id.swipedismissbehavior);
        SwipeDismissBehavior<View> swipeDismissBehavior = new SwipeDismissBehavior();
        swipeDismissBehavior.setSwipeDirection(SwipeDismissBehavior.SWIPE_DIRECTION_ANY);
        swipeDismissBehavior.setListener(
                new SwipeDismissBehavior.OnDismissListener() {
                    @Override
                    public void onDismiss(View view) {

                    }

                    @Override
                    public void onDragStateChanged(int state) {

                    }
                });
        CoordinatorLayout.LayoutParams coordinatorParams = (CoordinatorLayout.LayoutParams) swipeView.getLayoutParams();
        coordinatorParams.setBehavior(swipeDismissBehavior);
    }
}
