package com.wpf.kotlintest.interfaceAndClass

import android.util.Log

/**
 * Created by wangpengfei on 2018/3/28.
 * 实现接口Person
 */
class Teacher(override var sex: Int) :Person , Man() {
    //方式一
//    class Teacher(override var sex: Int) :Person {
    //方式二
/*class Teacher() :Person {
    override var sex: Int = 5*/
    override fun get(age: Int) {
        Log.e("wpf","测试接口Person的get()==age="+age)
    }

    override fun get(name: String) {
        Log.e("wpf","测试接口Person的get()==name="+name)
    }

    override fun eat() {
        //是否复用父类的方法体
//        super.eat()
        Log.e("wpf","测试父类man的eat()===")
    }
}