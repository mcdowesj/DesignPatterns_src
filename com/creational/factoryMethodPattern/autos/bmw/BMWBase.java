package com.creational.factoryMethodPattern.autos.bmw;

import com.creational.factoryMethodPattern.autos.Automobile;

import java.util.logging.Logger;

/**
 * This actually gives us a nice example of the Abstract Factory Pattern as we can return various objects from a
 * "family" of objects. In our case BMW objects.
 */
public abstract class BMWBase implements Automobile {

    private static Logger log = Logger.getLogger(BMWBase.class.getName());

    public abstract String getName();

    @Override
    public void turnOn(){
        log.info("The "+ getName() + " is on and running.");
    }

    @Override
    public void turnOff(){
        log.info("The "+ getName() + " is off.");
    }
}
