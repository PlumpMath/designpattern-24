package main.java.proxypattern;

/**
 * Created by semih on 26.04.2015.
 */

//This one is the real object's class
public class Car implements ICar {

    @Override
    public void moveCar() {
        System.out.println("Car has been driven");
    }
}
