package com.wpf.kotlintest.interfaceAndClass

/**
 * Created by wangpengfei on 2018/3/28.
 * 接口定义
 */
interface Person {
    var sex:Int
    fun get(name:String)
    fun get(age:Int)

    //注意
//    fun get(name:String)   这个方法必须实现
//    fun get(name:String){}   可以不实现
}