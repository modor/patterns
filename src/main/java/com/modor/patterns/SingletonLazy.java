package com.modor.patterns;

public class SingletonLazy {
    private SingletonLazy() {
    }

    private int testData;

    private static SingletonLazy singletonLzay = null;

    public static SingletonLazy getInstance() {
        if (singletonLzay == null) {
            synchronized (SingletonLazy.class) {
                if (singletonLzay == null)
                    singletonLzay = new SingletonLazy();
            }
        }
        return singletonLzay;
    }

    public int getTestData() {
        return testData;
    }

    public void setTestData(int testData) {
        this.testData = testData;
    }
}
