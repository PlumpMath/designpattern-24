package main.java.builder;

/**
 * Created by Ufuk on 27-03-15.
 */
public class Brand {

    private String brand;

    public Brand(String brand) {
        setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return brand;
    }

}

