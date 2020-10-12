package com.lx.sophon

import android.app.Application
import com.didichuxing.doraemonkit.DoraemonKit
import com.lzy.okgo.OkGo

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        DoraemonKit.install(this, "e28f7b4c4cdeb7cf93f41cfb38a41e3c")
        OkGo.getInstance().init(this)
    }
}