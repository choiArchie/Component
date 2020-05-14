package com.ex.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.user.componentlib.ServiceFactory;

@SuppressWarnings("all")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mLogin, mMine, mLoginUser;
    private FrameLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLogin = findViewById(R.id.bt_login);
        mLogin.setOnClickListener(this);
        mMine = findViewById(R.id.bt_mine);
        mMine.setOnClickListener(this);
        mLoginUser = findViewById(R.id.bt_login_user);
        mLoginUser.setOnClickListener(this);
        mLayout = findViewById(R.id.fl_container);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                ServiceFactory.getInstance().getLoginService().launch(MainActivity.this);
                break;
            case R.id.bt_mine:
                ServiceFactory.getInstance().getMineService().launch(MainActivity.this, 1);
                break;
            case R.id.bt_login_user:
                ServiceFactory.getInstance().getLoginService().getUserFragment(getSupportFragmentManager(), R.id.fl_container, new Bundle());
                break;

        }
    }
}
