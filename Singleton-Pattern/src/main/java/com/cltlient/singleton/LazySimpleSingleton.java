package com.cltlient.singleton;

/**
 * @author cltlient
 * @version V1.0
 * @Package com.cltlient.singleton
 * @date 2020/10/19 10:47
 * @Copyright © 2015-2020
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    //静态块，公共内存区域
    private static LazySimpleSingleton lazySimpleSingleton = null;
    public synchronized static LazySimpleSingleton getInstance(){
        if (lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

}
