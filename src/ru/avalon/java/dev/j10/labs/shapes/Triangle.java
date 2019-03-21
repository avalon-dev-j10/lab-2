package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private float sizeOfFirstSide;
    private float sizeOfSecondSide;
    private float sizeOfThirdSide;

    private float perimeter;
    private float area;
    private int rotation = 0;


    //Строим треугольник по трем точкам
    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint){
        sizeOfFirstSide = Line.calculateSide(firstPoint, secondPoint);
        sizeOfSecondSide = Line.calculateSide(secondPoint, thirdPoint);
        sizeOfThirdSide = Line.calculateSide(thirdPoint, firstPoint);

        perimeter = this.sizeOfFirstSide + this.sizeOfSecondSide + this.sizeOfThirdSide;

        //Вычисляем площадь по формуле Герона
        float halfOfPerimeter = perimeter/2;
        float expressionUnderRoot = halfOfPerimeter*(halfOfPerimeter - sizeOfFirstSide)*
                (halfOfPerimeter - sizeOfSecondSide)*(halfOfPerimeter - sizeOfThirdSide);

        area = (float)Math.sqrt(expressionUnderRoot);
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
