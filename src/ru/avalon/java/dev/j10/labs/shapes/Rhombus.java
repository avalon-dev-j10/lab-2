package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

/**
 * Представление о ромбе.
 * <p>
 * Ромб (др.-греч. ῥόμβος, лат. rombus, в буквальном
 * переводе: «бубен») — это параллелограмм, у которого все
 * стороны равны
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%BC%D0%B1">Ромб</a>
 */
public class Rhombus implements Polygon {

    float length; // длинна стороны ромба
     
     
     Random rand = new Random();
     
     public Rhombus () {
        this.length = (float) (Math.random()*10);
         }
    @Override
    public float getArea() {
        float s = length * length; // S - площадь круга
       return s;
    }

    @Override
    public int getRotation() {
        int angle = rand.nextInt(360);
        return angle;
    }

    @Override
    public float getPerimeter() {
        float p = 4 * length;
        return p;
    }
    /*
     * TODO: Реализовать класс 'Rhombus'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
