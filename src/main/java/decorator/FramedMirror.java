package main.java.decorator;

/**
 * Created by Ufuk on 22-04-15.
 */
public class FramedMirror extends MirrorDecorator {

    public void produce() {
        getMirror().produce();
        addFrame();
    }

    public void addFrame() {
        System.out.println("Frame has been added on mirror.");
    }

}