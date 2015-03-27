package main.java.factorypattern;

/**
 * Created by Ufuk on 27-03-15.
 */
public class ShapeFactory {

    
    public static Shape create(ShapeTypes type) {
        if(ShapeTypes.CIRCLE == type)
            return new Circle();

        return null;

    }

}
