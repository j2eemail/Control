package com.lxs.control.design;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lxs.control.R;

/**
 * Created by Administrator on 2017/5/24.
 */

public class BottomSheetDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_bottomsheetdialog);
        setTitle(getString(R.string.BottomSheetDialog));

//        android.support.design.widget.BottomSheetDialogFragment

    }

    public void dialogOnClick(View view){
        BottomSheetDialog mBottomSheetDialog = new BottomSheetDialog(this);
        mBottomSheetDialog.setContentView(getLayoutInflater().inflate(R.layout.item_02, null));
        mBottomSheetDialog.show();
        mBottomSheetDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {

            }
        });

    }
}
