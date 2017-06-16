package com.structural.decotatorPattern.decorators;

import com.structural.decotatorPattern.component.Sandwich;

/**
 * Implementation of the Sandwich can be a concrete class or an instance of another decorator. We will add more and more
 * decorators to this as we build our sandwich.
 *
 * This is our Decorator. We can see if contains another entity/object (composition).
 */
public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make(){
        return customSandwich.make();
    }
}
