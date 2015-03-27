package main.java.builder;

/**
 * Created by semih on 27.03.2015.
 */
public class Test {

    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        orderManager.createOrder("Audi","2005","Red",150);

        orderManager.printOrder();

    }

}
