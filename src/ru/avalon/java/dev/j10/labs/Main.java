package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.factories.RandomShapeFactory;
import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new RandomShapeFactory();

        Shape[] shapes = new Shape[20];

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать элементы массива 'shapes'
         *    20-ю случайными фигурами.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью.
         */
        for (int i = 0; i < 20; i++){
            shapes[i] = factory.getInstance();
        }

        Shape shapeWithMaxArea = shapes[0];
        for (int i = 1; i < 20; i++){
            if (shapeWithMaxArea.getArea() < shapes[i].getArea())
                shapeWithMaxArea = shapes[i];
        }
    }
}
