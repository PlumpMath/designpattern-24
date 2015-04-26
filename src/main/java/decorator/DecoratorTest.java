package main.java.decorator;

/**
 * Created by Ufuk on 22-04-15.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        HouseholdGoods mirror = new FramedMirror();
        mirror.produce();
    }

}