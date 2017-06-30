package com.structural.bridgePattern.abstraction.refinedAbstraction;

import com.structural.bridgePattern.abstraction.Manuscript;
import com.structural.bridgePattern.implementor.IFormatter;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.logging.Logger;

public class FAQ extends Manuscript{
    private static Logger logger = Logger.getLogger(FAQ.class.getName());

    private String title;

    private HashMap<String, String> questions;

    public FAQ(IFormatter formatter) {
        super(formatter);
        questions = new HashMap<>();
    }

    @Override
    public void print() {
        StringBuffer content = new StringBuffer(formatter.format("Title", title));
        questions.forEach((k, v)-> content.append(formatter.format("Question", k) + " - " +
                                                  formatter.format("Answer", v)));
        logger.info(content.toString());
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addQuestionWithAnswer(String question, String answer){
        this.questions.put(question, answer);
    }
}
