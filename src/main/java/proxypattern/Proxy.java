package main.java.proxypattern;

/**
 * Created by semih on 26.04.2015.
 */
public class Proxy implements ICar {

    private ICar realCar;
    private Driver driver;

    public Proxy(Driver driver) {
        this.realCar = new Car();
        this.driver = driver;
    }

    @Override
    public void moveCar() {
        if (driver.getAge() < 18) {
            System.out.println("Sorry driver is too young to drive a car");
        } else {
            realCar.moveCar();
        }
    }
}
