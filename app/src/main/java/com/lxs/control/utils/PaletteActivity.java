package com.lxs.control.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.view.View;
import android.widget.ImageView;

import com.lxs.control.R;

/**
 * Android 5.0
 * Created by Administrator on 2017/5/21.
 */

public class PaletteActivity extends AppCompatActivity {
    private ImageView imageView;
    ArrayMap<String, Integer> arrayMap = new ArrayMap<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.util_palette);
        setTitle(getString(R.string.Palette));

        arrayMap.put("color_01", R.mipmap.color_01);
        arrayMap.put("color_02", R.mipmap.color_02);
        arrayMap.put("color_03", R.mipmap.color_03);

        imageView = (ImageView) findViewById(R.id.palette_image);
    }

    public void btnOnClick(View view) {
        imageView.setImageResource(getResId());
    }

    public void btnOnClick1(final View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), arrayMap.get(imageView.getTag().toString()));
        Palette.Builder builder = Palette.from(bitmap);
//        Palette palette = builder.generate();//同步
//        Palette.Swatch swatch = palette.getVibrantSwatch();
//        if (null != swatch) {
//            view.setBackgroundColor(swatch.getRgb());
//        }
        builder.generate(new Palette.PaletteAsyncListener() {//异步
            @Override
            public void onGenerated(Palette palette) {
                Palette.Swatch swatch = palette.getVibrantSwatch();
                if (null != swatch) {
                    view.setBackgroundColor(swatch.getRgb());
                }
            }
        });
    }

    public int getResId() {
        if ("color_01".equals(imageView.getTag().toString())) {
            imageView.setTag("color_02");
            return R.mipmap.color_02;
        } else if ("color_02".equals(imageView.getTag().toString())) {
            imageView.setTag("color_03");
            return R.mipmap.color_03;
        } else if ("color_03".equals(imageView.getTag().toString())) {
            imageView.setTag("color_01");
            return R.mipmap.color_01;
        } else {
            imageView.setTag("color_01");
            return R.mipmap.color_01;
        }
    }
}
