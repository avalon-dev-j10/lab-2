package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Shape, Ellipse {

    float r; // радиус круга
    
     public Circle() {
        this.r = (float) (Math.random()*10);
    }
    
    @Override
    public float getArea() {
        float s = (float) (r * (Math.PI) * (Math.PI)); // S - площадь круга
       return s;
    }

    @Override
    public float getLength() {
        float p = (float) (2 * r * Math.PI); // S - длинна периметра круга
       return p;
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
