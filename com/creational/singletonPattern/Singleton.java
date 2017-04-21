package com.creational.singletonPattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This singletonPattern would be loaded on server start. This could significantly increase the application startup time and
 * we probably don't even want every singletonPattern to be loaded into memory straightaway.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public void doSomething(){
        Logger.getLogger(Singleton.class.getName()).log(Level.INFO, "Hi, my name is " +this);
    }
}
