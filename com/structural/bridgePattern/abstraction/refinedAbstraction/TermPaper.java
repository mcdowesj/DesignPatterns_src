package com.structural.bridgePattern.abstraction.refinedAbstraction;

import com.structural.bridgePattern.abstraction.Manuscript;
import com.structural.bridgePattern.implementor.IFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TermPaper extends Manuscript {
    private static Logger logger = Logger.getLogger(TermPaper.class.getName());

    private String className;
    private String studentID;
    private String text;
    private List<String> references;


    public TermPaper(IFormatter formatter) {
        super(formatter);
        this.references = new ArrayList<>();
    }


    @Override
    public void print() {
        StringBuffer content = new StringBuffer();
        content.append(formatter.format("Class", this.className));
        content.append(formatter.format("StudentID", this.studentID));
        content.append(formatter.format("Text", this.text));
        for(String reference : references){
            content.append(formatter.format("Reference", reference));
        }

        logger.info(content.toString());
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }

    public void addReference(String reference){
        this.references.add(reference);
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setText(String text) {
        this.text = text;
    }
}
