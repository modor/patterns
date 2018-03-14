package io.modor.patterns.singleton;

public class SingletonEager {
    private SingletonEager() {
    };

    private int testData;

    public int getTestData() {
        return testData;
    }

    public void setTestData(int testData) {
        this.testData = testData;
    }

    private static SingletonEager singletonEager = new SingletonEager();

    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
