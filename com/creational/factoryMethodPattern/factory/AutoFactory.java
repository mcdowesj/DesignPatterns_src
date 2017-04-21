package com.creational.factoryMethodPattern.factory;

import com.creational.factoryMethodPattern.autos.Automobile;

public interface AutoFactory {
    Automobile createSportsCar();
    Automobile createLuxuryCar();
    Automobile createEconomyCar();
}
