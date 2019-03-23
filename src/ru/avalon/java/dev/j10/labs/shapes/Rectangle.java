package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape, Polygon {

     float length; // длинна прямоугольника
     float width; // ширина прямоугольника
     
     Random rand = new Random();
     
     public Rectangle() {
        this.length = (float) (Math.random()*10);
        this.width = (float) (Math.random()*10);
     }
    @Override
    public float getArea() {
        float s = length * width; // S - площадь круга
       return s;
    }

    @Override
    public int getRotation() {
        int angle = rand.nextInt(360);
        return angle;
    }

    @Override
    public float getPerimeter() {
        float p = 2 * (length + width);
        return p;
    }

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
     
