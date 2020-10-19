package com.cltlient.singleton;

/**
 * @author cltlient
 * @version V1.0
 * @Package com.cltlient.singleton
 * @date 2020/10/19 10:36
 * @Copyright © 2015-2020
 */
public class Client {
    public static void main(String[] args) {
        Singleton.getInstance();
    }

    static class Singleton{
        private static final Singleton instance = new Singleton();

        private Singleton(){}

        public static Singleton getInstance(){
            return instance;
        }
    }
}
