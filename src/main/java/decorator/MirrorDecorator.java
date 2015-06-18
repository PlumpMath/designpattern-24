package main.java.decorator;

/**
 * Created by Ufuk on 22-04-15.
 */
public abstract class MirrorDecorator implements HouseholdGoods {

    private HouseholdGoods mirror = new Mirror();

    public void setMirror(HouseholdGoods mirror) {
        this.mirror = mirror;
    }

    public HouseholdGoods getMirror() {
        return mirror;
    }
}