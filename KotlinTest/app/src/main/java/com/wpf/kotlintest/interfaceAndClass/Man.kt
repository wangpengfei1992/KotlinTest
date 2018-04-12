package com.wpf.kotlintest.interfaceAndClass

import android.util.Log

/**
 * Created by wangpengfei on 2018/3/28.
 * 定义父类 方法名和类名必须用open修饰
 */
open class Man {
     open fun eat(){
         Log.e("man","like eat fish")
     }

     open fun drink(){
         Log.e("man","must drink water")
     }
}
