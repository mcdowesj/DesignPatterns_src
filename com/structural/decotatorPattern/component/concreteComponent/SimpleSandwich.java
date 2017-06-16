package com.structural.decotatorPattern.component.concreteComponent;

import com.structural.decotatorPattern.component.Sandwich;

/**
 * This is our ConcreteComponent
 */

public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}
