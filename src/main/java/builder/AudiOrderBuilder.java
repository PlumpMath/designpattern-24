package main.java.builder;

/**
 * Created by Ufuk on 27-03-15.
 */
public class AudiOrderBuilder extends OrderBuilder {

    public AudiOrderBuilder() {
    }

    public void setHorsePower(int power) {
        getCar().setHorsePower(power);
    }

    public void setBrand(String brand) {
        getCar().setBrand(new Brand(brand));
    }

    public void setModel(String model) {
        getCar().setModel(new Model(model));
    }

    public void setColor(String color) {
        getCar().setColor(color);
    }

}
