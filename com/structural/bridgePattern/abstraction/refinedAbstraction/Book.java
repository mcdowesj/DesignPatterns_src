package com.structural.bridgePattern.abstraction.refinedAbstraction;

import com.structural.bridgePattern.abstraction.Manuscript;
import com.structural.bridgePattern.implementor.IFormatter;

import java.util.logging.Logger;

public class Book extends Manuscript {
    private static Logger logger = Logger.getLogger(Book.class.getName());


    private String title;
    private String author;
    private String text;

    public Book(IFormatter formatter) {
        super(formatter);
    }

    @Override
    public void print() {
        StringBuffer content = new StringBuffer();
        content.append(formatter.format("Title", this.title));
        content.append(formatter.format("Author", this.author));
        content.append(formatter.format("Text", this.text));

        logger.info(content.toString());
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }
}
