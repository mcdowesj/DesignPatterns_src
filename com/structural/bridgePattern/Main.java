package com.structural.bridgePattern;

import com.structural.bridgePattern.abstraction.Manuscript;
import com.structural.bridgePattern.abstraction.refinedAbstraction.Book;
import com.structural.bridgePattern.abstraction.refinedAbstraction.FAQ;
import com.structural.bridgePattern.abstraction.refinedAbstraction.TermPaper;
import com.structural.bridgePattern.implementor.IFormatter;
import com.structural.bridgePattern.implementor.conctreteImplementor.BackwardsFormatter;
import com.structural.bridgePattern.implementor.conctreteImplementor.FancyFormatter;
import com.structural.bridgePattern.implementor.conctreteImplementor.StandardFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * Decouple an abstraction from its implementation so the two can vary independently
 *
 * Abstractions are coupled to implementations by default. The aim of this pattern is to remove this so both can
 * vary independently.
 *
 *
 *      Abstraction *-------------  Implementor
 *          /\                          /\
 *          |                           |
 *          |                           |
 *      Refined Abstractions        Concrete Implementors
 *
 *
 * Swapping our the different formatters will change how the data is displayed. If we needed to add additional printing
 * functionality, due to new requirements, all we now need to do is create a new formatter and define how it formats
 * the data. This avoids a complex hierarchy of different classes to handle each type of formatter.
 *
 * We have essentially created an additional layer of abstraction between the abstraction and implementation.
 *
 * The Adapter and Bridge patterns can often be confused. A simple explanation from the GoF -
 * "Adapter makes things work after they're designed; Bridge makes them work before they are."
 *
 *  - We can use the Adapter when we have existing code that is not changeable to meet our needs (legacy, 3rd party API).
 *  - We can use the Bridge when we are implementing our code up front. It provides a way to decouple the interface and
 *    implementation in a way that avoids a large number of classes.
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        List<Manuscript> docuements = new ArrayList<>();
        IFormatter formatter = new StandardFormatter();

        /*
          Swap the formatters in and out to see the changes in how things are displayed. Another formatter could be
          CamelCaseFormatter. Try to implement that and just swap it in here...it's that easy.
         */
//        IFormatter formatter = new BackwardsFormatter();
//        IFormatter formatter = new FancyFormatter();

        FAQ faq = new FAQ(formatter);
        faq.setTitle("The Bridge Pattern FAQ");
        faq.addQuestionWithAnswer("What is it?", "A Structural Design Pattern");
        faq.addQuestionWithAnswer("When should I use it?", "When you need to seperate an abstraction from an implementation");
        docuements.add(faq);

        Book book = new Book(formatter);
        book.setTitle("What is this?");
        book.setAuthor("Scott McDowell");
        book.setText("It all started on that warm, sunny, afternoon...");
        docuements.add(book);

        TermPaper paper = new TermPaper(formatter);
        paper.setClassName("Design Patterns 101");
        paper.setStudentID("123456");
        paper.setText("I think the Bridge Pattern is...");
        paper.addReference("Pluralsight");
        docuements.add(paper);

        for(Manuscript doc : docuements){
            doc.print();
        }
    }
}
