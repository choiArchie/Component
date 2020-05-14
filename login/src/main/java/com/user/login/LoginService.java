package com.user.login;

import android.content.Context;
import android.content.Intent;
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
public class LoginService implements ILoginService {
    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment getUserFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserFragment userFragment = new UserFragment();
        userFragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId, userFragment).commit();
        return userFragment;
    }
}
