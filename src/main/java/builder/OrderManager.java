package main.java.builder;

/**
 * Created by semih on 27.03.2015.
 */
public class OrderManager {

    private OrderBuilder orderBuilder;

    public Car createOrder(String brand, String model, String color, int power) {
        if (brand.equalsIgnoreCase("audi"))
            orderBuilder = new AudiOrderBuilder();

        orderBuilder.setBrand(brand);
        orderBuilder.setHorsePower(power);
        orderBuilder.setColor(color);
        orderBuilder.setModel(model);

        return orderBuilder.getCar();
    }

    public void printOrder() {
        System.out.println("Brand " + orderBuilder.getCar().getBrand());
        System.out.println("Model " + orderBuilder.getCar().getModel());
        System.out.println("Color " + orderBuilder.getCar().getColor());
        System.out.println("Horse Power " + orderBuilder.getCar().getHorsePower());
    }

}
