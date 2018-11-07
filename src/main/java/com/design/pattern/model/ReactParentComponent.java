package com.design.pattern.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by a1342631 on 11/1/18.
 */
public class ReactParentComponent {
    private String data;
    private PropertyChangeSupport support;

    public ReactParentComponent() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.removePropertyChangeListener(propertyChangeListener);
    }

    public void setData(String val) {
        support.firePropertyChange("data", this.data, val);
        this.data = val;
    }
}
