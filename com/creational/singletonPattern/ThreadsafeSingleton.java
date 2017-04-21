package com.creational.singletonPattern;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadsafeSingleton {
    private static ThreadsafeSingleton instance;

    private ThreadsafeSingleton() {
    }

    public static ThreadsafeSingleton getInstance() {
        if (instance == null) {//This outer layer is not threadsafe. But, if it's already not null then we dont care
            synchronized (ThreadsafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadsafeSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        Logger.getLogger(ThreadsafeSingleton.class.getName()).log(Level.INFO, "Hi, my name is " + this);
    }
}
