package com.a3.FactoryPattern;

import com.a3.FactoryPattern.Pizza.ChessePizza;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        ChessePizza pizza = (ChessePizza) pizzaFactory.createPiza("chesse");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }
}
