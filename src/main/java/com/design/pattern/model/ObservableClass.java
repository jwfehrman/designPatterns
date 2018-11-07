package com.design.pattern.model;

import java.util.Observable;

/**
 * Created by a1342631 on 11/1/18.
 */
public class ObservableClass  extends Observable {
    private String data;

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers(data);
    }
}
