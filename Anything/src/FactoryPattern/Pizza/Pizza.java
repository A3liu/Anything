package FactoryPattern.Pizza;

public class Pizza {

    protected String name = null;

    public Pizza() {
        name = "normalPizza";
    }


    public void prepare() {
        System.out.println("prepare " + name);
    }

    public void bake() {
        System.out.println("bake " + name);
    }

    public void cut() {
        System.out.println("cut " + name);
    }

    public void box() {
        System.out.println("put " + name + " into box!");
    }
}
