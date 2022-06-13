package com.cookandroid.allownoisetome;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        KakaoSdk.init(this, "233f7f31ec3571c4c70617b547604291");
    }
}
