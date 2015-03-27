package main.java.singleton;

/**
 * Created by semih on 27.03.2015.
 */
public class Singleton {

    private static Singleton single = new Singleton();

    private Singleton(){

    }

    public static Singleton create(){
        return single;
    }

    void message(){
        System.out.println("Singleton object is worked.");
    }

}
