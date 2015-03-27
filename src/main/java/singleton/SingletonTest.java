package main.java.singleton;

/**
 * Created by semih on 27.03.2015.
 */
public class SingletonTest {

    public static void main(String[] args) {

        Singleton s = Singleton.create();

        s.message();

        Singleton s1 = Singleton.create();
        s1.message();

    }

}
