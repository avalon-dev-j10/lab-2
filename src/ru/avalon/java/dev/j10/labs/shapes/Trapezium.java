package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о трапеции.
 * <p>
 * Трапе́ция (от др.-греч. τραπέζιον — «столик» от τράπεζα —
 * «стол») — выпуклый четырёхугольник, у которого две
 * стороны параллельны. Часто в определение трапеции
 * добавляют условие, что две другие стороны должны быть не
 * параллельны.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B0%D0%BF%D0%B5%D1%86%D0%B8%D1%8F">Трапеция</a>
 */
public class Trapezium implements Polygon {

    /*
     * TODO: Реализовать класс 'Trapezium'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private float topBase;
    private float bottomBase;
    private float leftLateral ;
    private float rightLateral;

    private float perimeter;
    private float area;
    private int rotation = 0;

    public Trapezium(float topBase, float bottomBase, float leftLateral, float rightLateral){
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.leftLateral = leftLateral;
        this.rightLateral = rightLateral;

        perimeter = topBase + bottomBase + leftLateral + rightLateral;

        //Определяем площадь трапеции по формуле Герона
        float halfOfPerimeter = perimeter/2;

        float firstPartOfFormula = (topBase + bottomBase)/(4*Math.abs(topBase - bottomBase));

        float expressionUnderRoot = (halfOfPerimeter - topBase)*(halfOfPerimeter - bottomBase)*
                (halfOfPerimeter - topBase - leftLateral)*(halfOfPerimeter - topBase - rightLateral);
        float secondPartOfFormula = (float)Math.sqrt(expressionUnderRoot);

        area = firstPartOfFormula*secondPartOfFormula;
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
