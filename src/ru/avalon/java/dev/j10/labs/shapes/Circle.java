package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private float radius;
    private float abscissaOfCenter;
    private float ordinateOfCenter;

    private float length;
    private float area;

    public Circle(float radius, float abscissaOfCenter, float ordinateOfCenter){
        this.radius = radius;
        this.abscissaOfCenter = abscissaOfCenter;
        this.ordinateOfCenter = ordinateOfCenter;

        length = 2*PI*radius;
        area = PI*radius*radius;
    }

    @Override
    public float getLength() {
        return length;
    }

    @Override
    public float getArea() {
        return area;
    }

    @Override
    public float getX() {
        return abscissaOfCenter;
    }

    @Override
    public float getY() {
        return ordinateOfCenter;
    }
}
