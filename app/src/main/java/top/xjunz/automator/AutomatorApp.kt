package top.xjunz.automator

import android.app.Application
import android.content.Context

/**
 * @author xjunz 2021/6/25
 */
class AutomatorApp : Application() {
    companion object {
        lateinit var appContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }
}