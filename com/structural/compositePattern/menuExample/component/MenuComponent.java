package com.structural.compositePattern.menuExample.component;

import java.util.ArrayList;
import java.util.List;

/**
 * This is our Component
 */

public abstract class MenuComponent {

    protected String name;
    protected String url;
    protected List<MenuComponent> menuComponents = new ArrayList<>();



    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public abstract String toString();

    protected String print(MenuComponent menuComponent){
        StringBuilder sb = new StringBuilder(name);
        sb.append(": ");
        sb.append(url);
        sb.append("\n");
        return sb.toString();
    }
}
