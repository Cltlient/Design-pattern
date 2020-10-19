package com.cltlient.singleton;

/**
 * @author cltlient
 * @version V1.0
 * @Package com.cltlient.singleton
 * @date 2020/10/19 10:53
 * @Copyright © 2015-2020
 */
public class ExectorThread implements Runnable {
    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
