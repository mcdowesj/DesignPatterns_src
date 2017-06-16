package com.structural.compositePattern.menuExample.leaf;

import com.structural.compositePattern.menuExample.component.MenuComponent;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
