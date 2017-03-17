package com.xiaohai.wanderer;

import android.app.Application;

/**
 * Created by U on 2017/3/17.
 */

public class App extends Application{

    public static App INSTANCE;
    public static App getInstance(){
        return INSTANCE;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE=this;
    }
}
