package main.java.decorator;

/**
 * Created by Ufuk on 22-04-15.
 */
public class Mirror implements HouseholdGoods {

    @Override
    public void produce() {
        System.out.println("Mirror has been produced.");
    }

}