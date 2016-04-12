package com.jzhihui.imageloaderdemo;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.download.ImageDownloader;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        initData();
    }

    private void initData() {
        String imageUrl="http://www.jzhihui.com/mz/d/file/avatar/000/00/00/1_90x90.jpg";
     //   ImageDownloader.Scheme.FILE.wrap()
        /**
         * 配置图片
         */

        DisplayImageOptions options=new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .showImageOnLoading(R.drawable.arrow)
                .showImageOnFail(R.drawable.attention)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();

//        ImageLoader.getInstance().loadImage(imageUrl,new ImageSize(400,400),options,new SimpleImageLoadingListener(){
//            @Override
//            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
//                super.onLoadingComplete(imageUri, view, loadedImage);
//                imageView.setImageBitmap(loadedImage);
//            }
//        });

        ImageLoader.getInstance().displayImage(imageUrl,imageView,options);
    }
}
