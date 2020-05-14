package com.user.mine;

import android.content.Context;
import android.content.Intent;

import com.user.componentlib.IMineService;

/**
 * author: Tracy
 * date:   2019/8/20
 * version  v1.0
 * desc:
 **/
public class MineService implements IMineService {
    @Override
    public void launch(Context context, int userId) {
        Intent intent = new Intent(context, MineActivity.class);
        context.startActivity(intent);
    }
}
