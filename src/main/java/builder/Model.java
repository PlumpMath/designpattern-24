package main.java.builder;

/**
 * Created by aliyasar on 27/03/15.
 */
public class Model {

    private String model;

    public Model(String model)
    {
        setModel(model);
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String toString()
    {
        return model;
    }
}
