package main.java.factorypattern;

/**
 * Created by Ufuk on 27-03-15.
 */
public class FactoryPatternTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.create(ShapeTypes.CIRCLE);
        circle.draw();

        Shape ellipse = ShapeFactory.create(ShapeTypes.ELLIPSE);
        ellipse.draw();

        Shape rectangular = ShapeFactory.create(ShapeTypes.RECTANGULAR);
        rectangular.draw();

        Shape square = ShapeFactory.create(ShapeTypes.SQUARE);
        square.draw();

        Shape triangle = ShapeFactory.create(ShapeTypes.TRIANGLE);
        triangle.draw();
    }
}
