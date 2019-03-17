package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private float height;
    private float width;

    private float perimeter;
    private float area;
    private int rotation = 0;

    public Rectangle(float height, float width){
        this.height = height;
        this.width = width;
        perimeter = (height + width)*2;
        area = height*width;
    }

    @Override
    public float getPerimeter() {
        return perimeter;
    }

    @Override
    public float getArea() {
        return area;
    }

    @Override
    public void rotate(int angleOfRotation) {
        if (angleOfRotation > 360)
            angleOfRotation = angleOfRotation % 360;
        if (angleOfRotation < 0)
            angleOfRotation = 360 - angleOfRotation % 360;
        rotation = angleOfRotation;
    }

    @Override
    public int getRotation() {
        return rotation;
    }
}
