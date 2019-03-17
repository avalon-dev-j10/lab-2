package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class RandomCircleFactory implements ShapeFactory {

    private Random randomParameter = new Random(100);

    @Override
    public Shape getInstance() {
        return new Circle(randomParameter.next(), randomParameter.next(), randomParameter.next());
    }
}
