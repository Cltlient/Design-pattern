package com.cltlient.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author cltlient
 * @version V1.0
 * @Package com.cltlient.singleton
 * @date 2020/10/19 11:48
 * @Copyright © 2015-2020
 */
public class LazyInnerTest {
    @Test
    public static void main(String[] args) {
        try {
            //如果有人恶意用反射破坏
            Class<?> clazz = LazyStaticInnerClassSingleton.class;

            //通过反射获取私有的构造方法
            Constructor constructor = clazz.getDeclaredConstructor(null);
            //强制访问
            constructor.setAccessible(true);

            //暴力初始化
            Object o1 = constructor.newInstance();

            //调用两次构造方法，相当于new了两次
            Object o2 = constructor.newInstance();
            System.out.println(o1==o2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
