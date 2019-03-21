package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Point;
import ru.avalon.java.dev.j10.labs.shapes.RealPoint;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Trapezium;

public class RandomTrapeziumFactory implements ShapeFactory {

    @Override
    public Shape getInstance() {
        //Общие координаты Y у двух пар точек необходимы для параллельности двух оснований трапеции.
        float commonTopY = randomParameter.next();
        float commonBottomY = randomParameter.next();

        Point firstPoint = new RealPoint(randomParameter.next(), commonBottomY);
        Point secondPoint = new RealPoint(randomParameter.next(), commonTopY);
        Point thirdPoint = new RealPoint(randomParameter.next(), commonTopY);
        Point fourthPoint = new RealPoint(randomParameter.next(), commonBottomY);

        return new Trapezium(firstPoint, secondPoint, thirdPoint, fourthPoint);
    }
}
