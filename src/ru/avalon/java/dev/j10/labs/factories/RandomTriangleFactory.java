package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Trapezium;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class RandomTriangleFactory implements ShapeFactory {

    private Random randomParameter = new Random(100);

    @Override
    public Shape getInstance() {
        return new Triangle(randomParameter.next(), randomParameter.next(), randomParameter.next());
    }
}
