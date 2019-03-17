package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class RandomRectangleFactory implements ShapeFactory {

    private Random randomParameter = new Random(100);

    @Override
    public Shape getInstance() {
        return new Rectangle(randomParameter.next(), randomParameter.next());
    }
}
