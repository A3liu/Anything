package com.a3.FactoryPattern;

import com.a3.FactoryPattern.Pizza.*;

public class SimplePizzaFactory {

    public Pizza createPiza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "chesse":
                pizza = new ChessePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return pizza;
    }
}
