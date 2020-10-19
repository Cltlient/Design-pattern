package com.cltlient.singleton;

/**
 * @author cltlient
 * @version V1.0
 * @Package com.cltlient.singleton
 * @date 2020/10/19 11:40
 * @Copyright © 2015-2020
 */
//兼顾饿汉式单例的写法的内存浪费和synchronized的性能问题，完美规避这两种缺点
public class LazyStaticInnerClassSingleton {
    //使用LazyInnerClassGeneral的时候，默认会先初始化内部类
    //如果没有使用，则内部类是不会加载的
    private LazyStaticInnerClassSingleton(){
        if (LazyHodler.INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //Static 是为了使单例模式的空间共享，保证这个方法不会被重写、重载
    private static LazyStaticInnerClassSingleton getInstance(){
        //在返回结果前一定会加载内部类
        return LazyHodler.INSTANCE;
    }

    //利用Java本身的语法特点，默认不加载内部类
    private static class LazyHodler{

        public static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
