package com.design.pattern.model;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by a1342631 on 11/1/18.
 */
public class ObserverClass implements Observer {
    private String name;
    private String data;

    public ObserverClass(String name){
        this.name = name;
    }

    public void update(Observable o,
                       Object data) {
        this.data = (String) data;
        System.out.println(name + ": Updated data to - " + this.data);
    }
}
