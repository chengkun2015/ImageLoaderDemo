package com.jzhihui.imageloaderdemo;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by 程 on 2016/4/9.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 默认的ImadeLoader配置参数
         */
//        final ImageLoaderConfiguration loaderConfiguration = ImageLoaderConfiguration.createDefault(this);
//
//        ImageLoader.getInstance().init(loaderConfiguration);

        //创建默认的ImageLoader配置参数
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this)
                .writeDebugLogs() //打印log信息

                .build();


        //Initialize ImageLoader with configuration.
        ImageLoader.getInstance().init(configuration);
    }
}
