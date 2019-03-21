package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о ромбе.
 * <p>
 * Ромб (др.-греч. ῥόμβος, лат. rombus, в буквальном
 * переводе: «бубен») — это параллелограмм, у которого все
 * стороны равны
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%BC%D0%B1">Ромб</a>
 */
public class Rhombus implements Polygon{

    /*
     * TODO: Реализовать класс 'Rhombus'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private float sizeOfSide;
    private int acuteAngle; //Острый угол ромба

    private float perimeter;
    private float area;
    private int rotation = 0;

    public Rhombus(float sizeOfSide, int acuteAngle){
        if (acuteAngle > 89)
            acuteAngle = 89;

        this.sizeOfSide = sizeOfSide;
        this.acuteAngle = acuteAngle;

        perimeter = sizeOfSide*4;

        float angleInRadian = (this.acuteAngle*Ellipse.PI)/180;
        area = (float)(sizeOfSide*sizeOfSide*Math.sin(angleInRadian));
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
