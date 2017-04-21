package com.creational.factoryMethodPattern.factory;

import com.creational.factoryMethodPattern.autos.Automobile;
import com.creational.factoryMethodPattern.autos.bmw.BMW328i;
import com.creational.factoryMethodPattern.autos.bmw.BMW740i;
import com.creational.factoryMethodPattern.autos.bmw.BMWM3;

/**
 * See {@link com.creational.factoryMethodPattern.autos.bmw.BMWBase BMWBase} for the family grouping.
 * We could probably do a better job of enforcing only BMWs being created.
 */
public class BMWFactory implements AutoFactory{

    @Override
    public Automobile createSportsCar() {
        return new BMWM3();
    }

    @Override
    public Automobile createLuxuryCar() {
        return new BMW740i();
    }

    @Override
    public Automobile createEconomyCar() { return new BMW328i();  }
}
