package com.structural.bridgePattern.abstraction;

import com.structural.bridgePattern.implementor.IFormatter;


/**
 * We have something that we can read/print; that is the concept behind our abstraction.
 * Our refined abstractions (Book, FAQ, TermPaper), or reading material, all extend
 * this class. We could easily add more reading materials that are not tightly
 * coupled to design. Our different formatters can then just be can then be used to change
 * how the data is displayed very easily. We don't need to add a "reversePrint" or
 * "fancyPrint" method to our Refined Abstractions as we can let the Concrete Implementors
 * (XFormatter) print the data however it is designed to do. All we need to do is call our
 * print method.
 */
public abstract class Manuscript {

    protected IFormatter formatter;

    public Manuscript(IFormatter formatter) {
        this.formatter = formatter;
    }

    public abstract void print();
}
