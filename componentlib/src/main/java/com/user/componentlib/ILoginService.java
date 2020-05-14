package com.user.componentlib;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


/**
 * author: Tracy
 * date:   2019/8/20
 * version  v1.0
 * desc:
 **/
public interface ILoginService {
    void launch(Context context);

    Fragment getUserFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
