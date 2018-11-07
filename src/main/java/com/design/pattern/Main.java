package com.design.pattern;

import com.design.pattern.model.ObservableClass;
import com.design.pattern.model.ObserverClass;
import com.design.pattern.model.ReactChildComponent;
import com.design.pattern.model.ReactParentComponent;

/**
 * Created by a1342631 on 11/1/18.
 */
public class Main {
    public static void main(String[] args) {

        //--- DEPRECATED OBSERVER METHOD IN JAVA 9 ---//
        runDeprecatedObserver();


        System.out.println("\n-----------------------------------\n");


        //------ NEW RECOMMENDED OBSERVER METHOD ------//
        runRecommendedObserver();

    }



    private static void runDeprecatedObserver(){
        ObservableClass observable = new ObservableClass();
        ObserverClass observer1 = new ObserverClass("observer1");
        ObserverClass observer2 = new ObserverClass("observer2");
        ObserverClass observer3 = new ObserverClass("observer3");

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.setData("NEW_DATA");
    }

    private static void runRecommendedObserver(){
        ReactParentComponent reactParentComponent = new ReactParentComponent();
        ReactChildComponent reactChildComponent1 = new ReactChildComponent("child1");
        ReactChildComponent reactChildComponent2 = new ReactChildComponent("child2");
        ReactChildComponent reactChildComponent3 = new ReactChildComponent("child3");

        reactParentComponent.addPropertyChangeListener(reactChildComponent1);
        reactParentComponent.addPropertyChangeListener(reactChildComponent2);
        reactParentComponent.addPropertyChangeListener(reactChildComponent3);

        reactParentComponent.setData("NEW_DATA");
        System.out.println();
        reactParentComponent.setData("EVEN_NEWER_DATA");
    }
}
