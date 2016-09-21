package com.modor.main;

import com.modor.patterns.SingletonEager;
import com.modor.patterns.SingletonLazy;

public class PatternStart {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SingletonLazy s0 = SingletonLazy.getInstance();
        s0.setTestData(100);
        SingletonLazy s1 = SingletonLazy.getInstance();
        System.out.println(s1.getTestData());

        SingletonEager s2 = SingletonEager.getInstance();
        s2.setTestData(101);
        SingletonEager s3 = SingletonEager.getInstance();
        System.out.println(s3.getTestData());

    }

}
