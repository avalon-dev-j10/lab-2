package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

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
public class Trapezium implements Shape, Polygon {

     float a; // меньшее основание тропеции
     float b; // основание трапеции
     float c; // левая сторона трапеции
     float d; // правая сторона трапеции
     float h; // высота
     float ang; // угол между основанием трапеции и левой стороной "float c"
     float l1; // отрехок между высотой и углом "angel"
     float l2; // отрехок между высотой и углом между основанием и стороной "d"
     
     Random rand = new Random();
     
     public Trapezium () {
        this.a = (float) (Math.random()*10);
        this.b = (float) (Math.random()*10);
        for (int i = 1 ; b <= a ; i++){  // так как одно из оснований трапеции должно быть больше, крутим цикл, пока "а" не выпадет меньше "b" 
         a = (float) (Math.random()*10);
        this.ang = rand.nextInt(89) + 1; // угол будет от 1 до 90 градусов
        }
        /* 
        Вспомним курс тригонометрии и вычислим стороны трапеции
        */
        this.h = (float) (c * Math.sin(ang));
        this.l1 = (float) (c * Math.cos(c));
        this.l2 = b - a - l1;
        this.d = (float) Math.sqrt((l2 *l2 + h*h)); // по теореме Пифагора
     }
    
    @Override
    public float getArea() {
        float s = h * (a = b)/2;
        return s;
    }

    @Override
    public int getRotation() {
          int angle = rand.nextInt(360);
        return angle;
    }

    @Override
    public float getPerimeter() {
        float p = a + b + c + d;
        return p;
    }

    /*
     * TODO: Реализовать класс 'Trapezium'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
