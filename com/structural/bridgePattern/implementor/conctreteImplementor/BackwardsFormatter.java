package com.structural.bridgePattern.implementor.conctreteImplementor;

import com.structural.bridgePattern.implementor.IFormatter;

public class BackwardsFormatter implements IFormatter {
    @Override
    public String format(String key, String value) {
        return String.format("%s: %s\n", key, new StringBuilder(value).reverse().toString());
    }
}
