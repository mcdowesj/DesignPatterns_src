package com.structural.decotatorPattern.decorators;

import com.structural.decotatorPattern.component.Sandwich;

/**
 * This is a ConcreteDecorator. It has the job to modify the behavior of the contained entity. In our case the
 * addDressing method.
 */
public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }
}
