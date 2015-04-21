package main.java.builder;

/**
 * Created by Ufuk on 27-03-15.
 */
public class AudiOrderBuilder extends OrderBuilder {

    public AudiOrderBuilder() {
    }

    @Override
    public void setHorsePower(int power) {
        getCar().setHorsePower(power);
    }

    @Override
    public void setBrand(String brand) {
        getCar().setBrand(new Brand(brand));
    }

    @Override
    public void setModel(String model) {
        getCar().setModel(new Model(model));
    }

    @Override
    public void setColor(String color) {
        getCar().setColor(color);
    }

}
