package com.creational.singletonPattern;

public class Main {
    public static void main(String ... args){
        Singleton singleton1 = Singleton.getInstance();
        singleton1.doSomething();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.doSomething();

        LazyLoadedSingleton lazySingleton1 = LazyLoadedSingleton.getInstance();
        lazySingleton1.doSomething();
        LazyLoadedSingleton lazySingleton2 = LazyLoadedSingleton.getInstance();
        lazySingleton2.doSomething();

        ThreadsafeSingleton threadSafeSingleton1 = ThreadsafeSingleton.getInstance();
        threadSafeSingleton1.doSomething();
        ThreadsafeSingleton threadsafeSingleton2 = ThreadsafeSingleton.getInstance();
        threadsafeSingleton2.doSomething();

    }
}
