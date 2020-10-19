package com.cltlient.singleton;

/**
 * @author cltlient
 * @version V1.0
 * @Package com.cltlient.singleton
 * @date 2020/10/19 10:42
 * @Copyright © 2015-2020
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingle;
    static {
        hungrySingle = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hungrySingle;
    }
}
