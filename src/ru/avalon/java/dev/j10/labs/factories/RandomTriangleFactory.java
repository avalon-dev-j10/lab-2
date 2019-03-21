package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class RandomTriangleFactory implements ShapeFactory {

    @Override
    public Shape getInstance() {
        Point firstPoint = new RealPoint(randomParameter.next(), randomParameter.next());
        Point secondPoint = new RealPoint(randomParameter.next(), randomParameter.next());
        Point thirdPoint = new RealPoint(randomParameter.next(), randomParameter.next());

        return new Triangle(firstPoint, secondPoint, thirdPoint);
    }
}
