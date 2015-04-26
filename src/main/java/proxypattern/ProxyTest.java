package main.java.proxypattern;

/**
 * Created by semih on 26.04.2015.
 */
public class ProxyTest {

    public static void main(String[] args) {
        ICar car = new Proxy(new Driver(17));
        car.moveCar();

        ICar car2 = new Proxy(new Driver(22));
        car2.moveCar();
    }

}
