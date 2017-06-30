package com.structural.bridgePattern.implementor.conctreteImplementor;

import com.structural.bridgePattern.implementor.IFormatter;

public class StandardFormatter implements IFormatter {
    @Override
    public String format(String key, String value) {
        return String.format("%s: %s\n", key, value);
    }
}
