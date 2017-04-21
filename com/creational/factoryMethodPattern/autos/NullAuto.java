package com.creational.factoryMethodPattern.autos;

import java.util.logging.Logger;

public class NullAuto implements Automobile {
    private static Logger log = Logger.getLogger(NullAuto.class.getName());

    @Override
    public void turnOn() {
        log.info("How can you turn on something that does not exist?");
    }

    @Override
    public void turnOff() {
        log.info("Don't even try.");
    }
}
