package com.user.componentlib;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.user.componentlib.ILoginService;

/**
 * author: Tracy
 * date:   2019/8/20
 * version  v1.0
 * desc:
 **/
public class EmptyLoginService implements ILoginService {
    @Override
    public void launch(Context context) {

    }

    @Override
    public Fragment getUserFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
