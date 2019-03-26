package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

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
     float sideOne; // первая сторона треугольника
     float sideTwo; // вторая сторона треугольника
     float sideThree; // третья сторона треугольника
     
     Random rand = new Random();
     
    public void Triangle (){
        this.sideOne = (float) (Math.random()*10);
        this.sideTwo =(float) (Math.random()*10);
        this.sideThree = (float) (Math.random()*10);
        for (int i = 1 ; sideOne + sideTwo <= sideThree; i++){
         sideThree = (float) (Math.random()*10);
        }
    }

    @Override
    public float getArea() {
       float pp = (float) (0.5 * (sideOne + sideTwo + sideThree)); // вычисление полупериметра для формулы Герона
       float s = (float) Math.sqrt(pp * (pp - sideOne) * (pp - sideTwo) * (pp - sideThree)); // S - площадь треугольника по формуле Герона
       return s;
    }

    @Override
    public int getRotation() {
        int angle = rand.nextInt(360);
        return angle;
    }

    @Override
    public float getPerimeter() {
        float p = sideOne + sideTwo + sideThree;
        return p;
    }
}
 