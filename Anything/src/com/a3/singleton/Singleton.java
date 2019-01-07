package com.a3.singleton;


public class Singleton {
    private static Singleton unique;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (unique == null) {
            synchronized (Singleton.class) {
                if (unique == null) {
                    unique = new Singleton();
                }
            }
        }
        return unique;
    }

}
