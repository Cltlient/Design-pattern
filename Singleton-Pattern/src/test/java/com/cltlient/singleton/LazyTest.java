package com.cltlient.singleton;

import org.junit.Test;

/**
 * @author cltlient
 * @version V1.0
 * @Package com.cltlient.singleton
 * @date 2020/10/19 10:54
 * @Copyright © 2015-2020
 */

public class LazyTest {
    @Test
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
