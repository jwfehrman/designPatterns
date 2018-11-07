package com.design.pattern.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by a1342631 on 11/1/18.
 */
public class ReactChildComponent implements PropertyChangeListener {
    private String name;
    private String data;

    public ReactChildComponent(String name) {
        this.name = name;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        this.data = (String) evt.getNewValue();
        System.out.println(name + ": received \"" + evt.getPropertyName() + "\" property change from " + evt.getOldValue() + " to " + evt.getNewValue());
    }
}
