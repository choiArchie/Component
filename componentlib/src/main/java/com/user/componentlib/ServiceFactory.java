package com.user.componentlib;

/**
 * author: Tracy
 * date:   2019/8/20
 * version  v1.0
 * desc:
 **/
public class ServiceFactory {
    public static final ServiceFactory instance = new ServiceFactory();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    private ILoginService mLoginService;

    private IMineService mMineService;

    public ILoginService getLoginService() {
        if (null == mLoginService){
            return new EmptyLoginService();
        }
        return mLoginService;
    }

    public void setLoginService(ILoginService loginService) {
        mLoginService = loginService;
    }

    public IMineService getMineService() {
        return mMineService;
    }

    public void setMineService(IMineService mineService) {
        mMineService = mineService;
    }
}
