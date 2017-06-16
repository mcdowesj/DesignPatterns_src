package com.structural.decotatorPattern;

import com.structural.decotatorPattern.decorators.DressingDecorator;
import com.structural.decotatorPattern.decorators.MeatDecorator;
import com.structural.decotatorPattern.component.Sandwich;
import com.structural.decotatorPattern.component.concreteComponent.SimpleSandwich;

import java.util.logging.Logger;

/**
 * The Decorator Patterns allows the attaching of additional responsibilities to an object dynamically. Decorators provide
 * a flexible alternative to subclassing for extended functionality.
 *
 *                    Component
 *                    operation()
 *                        |
 *                ------------------
 *                |                |
 *        ConcreteComponent    Decorator
 *           operation()       -component
 *                             +operation()
 *                                 |
 *                         ------------------
 *                         |                |
 *                ConcreteDecoratorA  ConcreteDecoratorB
 *                    +operation()      +operation()
 *                                      +otherOp()
 *
 * The original object can stay the same, we dont need to create concrete object to add functionality.
 *
 *
 */
public class Main {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(Main.class.getName());
        Sandwich mySandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        logger.info(mySandwich.make());
    }
}
