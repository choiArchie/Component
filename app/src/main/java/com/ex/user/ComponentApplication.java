package com.ex.user;

import android.app.Application;

import com.user.componentlib.AppCompat;
import com.user.componentlib.AppConfig;

/**
 * author: Tracy
 * date:   2019/8/20
 * version  v1.0
 * desc:
 **/
public class ComponentApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof AppCompat) {
                    ((AppCompat) object).initializa(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
