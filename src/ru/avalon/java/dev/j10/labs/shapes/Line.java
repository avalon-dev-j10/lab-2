package ru.avalon.java.dev.j10.labs.shapes;

public class Line {

    private Line(){};

    // Находим длину отрезка: строим дополнительный прямоугольный треугольник, искомый отрезок является гипотенузой.
    // По теореме Пифагора находим ее.
    public static float calculateSide(Point firstPoint, Point secondPoint){
        float firstCathetus = Math.abs(firstPoint.getX() - secondPoint.getX());
        float secondCathetus = Math.abs(firstPoint.getY() - secondPoint.getY());

        return (float)(Math.sqrt(Math.pow(firstCathetus, 2) + Math.pow(secondCathetus, 2)));
    }
}
