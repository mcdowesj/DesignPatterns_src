package com.creational.singletonPattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This gives removes the need to create on server start. We create an instance only when we need it. We can go one step
 * further and make this threadsafe, which is probably the best approach overall
 */
public class LazyLoadedSingleton {

    private static LazyLoadedSingleton instance;

    private LazyLoadedSingleton(){}

    public static LazyLoadedSingleton getInstance(){
        if(instance == null) { //This is our lazy load check...that's it
            instance = new LazyLoadedSingleton();
        }
        return instance;
    }

    public void doSomething(){
        Logger.getLogger(LazyLoadedSingleton.class.getName()).log(Level.INFO, "Hi, my name is " +this);
    }
}
