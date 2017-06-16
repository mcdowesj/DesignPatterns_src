package com.structural.decotatorPattern.decorators;

import com.structural.decotatorPattern.component.Sandwich;

/**
 * This is a ConcreteDecorator. It has the job to modify the behavior of the contained entity. In our case the
 * addMeat method.
 */
public class MeatDecorator extends SandwichDecorator{

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat(){
        return " + turkey";
    }
}
