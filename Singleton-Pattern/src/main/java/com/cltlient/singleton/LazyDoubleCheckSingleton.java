package com.cltlient.singleton;

/**
 * @author cltlient
 * @version V1.0
 * @Package com.cltlient.singleton
 * @date 2020/10/19 11:20
 * @Copyright © 2015-2020
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance;
    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        //检查是否要阻塞
            if(instance == null){
                synchronized (LazyDoubleCheckSingleton.class){
                    //检查是否要重新创建实例
                    if (instance==null) {
                        instance = new LazyDoubleCheckSingleton();
                    }
                }
            }
            return instance;
    }
}
