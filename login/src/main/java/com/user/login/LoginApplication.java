package com.user.login;

import android.app.Application;

import com.user.componentlib.AppCompat;
import com.user.componentlib.ServiceFactory;

/**
 * author: Tracy
 * date:   2019/8/20
 * version  v1.0
 * desc:
 **/
public class LoginApplication extends Application implements AppCompat {
    private static Application sApplication;

    public static Application getApplication() {
        return sApplication;
    }

    @Override
    public void initializa(Application application) {
        sApplication = application;
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
