package com.xzw.framelibrary.base

import android.content.Intent
import android.os.Bundle

/**
 * on 2017/3/20.
 */

internal interface AbsBaseActivity {
    /**
     * 视图，组件,数据的初始化
     */
    @Throws(Exception::class)
    fun init()

    fun init(savedInstanceState: Bundle?)
    /**
     * 初始化电量条和状态栏
     */
    fun initBar()

    fun initToolbar(): Boolean
    /**
     * 设置布局id
     */
    fun setInflateId(): Int
}
