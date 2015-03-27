package main.java.builder;

/**
 * Created by aliyasar on 27/03/15.
 */
public abstract class OrderBuilder {

    private Car car = null;

    public OrderBuilder(){

    }

    public Car getCar() {
        if (car == null)
            car = new Car();
            return car;
    }

    public abstract void setBrand(String brand);
    public abstract void setModel(String model);
    public abstract void setColor(String color);
    public abstract void setHorsePower(int hp);

}
