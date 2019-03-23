package ru.avalon.java.dev.j10.labs.factories;

import java.lang.reflect.Method;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.*;

/**
 * "Фабрика" фигур, возвращающая фигуры случайной природы.
 * <p>
 * Фабрика возвращает не только фигуры случайных типов, но
 * также обеспечивает случайную природу самих фигур. Другими,
 * словаим, если фабрика возвращает две фигуры одного и того
 * же типа, их структура, с высокой вероятностью, будет
 * отличатся.
 */
public class RandomShapeFactory implements ShapeFactory {

    /*
     * TODO: Реализуйте класс 'RandomShapeFactory'
     * Подумайте о том, какой может быть реализация.
     *
     * Как можно улучшить реализацию, создав специализированные
     * фабрики, создающие конкретные подвиды фигур?
     */

    /**
     * Возвращает случайную фигуру.
     * <p>
     * Разные вызовы метода могут возвращать экземпляры
     * различных типов. Например, два последовательных вызова
     * метода могут вернуть фигуры одного и того же типа,
     * но могут вернуть и фигуры различных типов.
     * <p>
     * Структура полученных фигур, также носит случайный
     * характер. Например, если два вызова метода возвращают
     * окружность, то это будут окружности с различным
     * радиусом.
     *
     * @return новый экземпляр типа {@link Shape}.
     */
    
 
    @Override
    public Shape getInstance() {
        Random rand = new Random();
        Shape [] figers = new Shape[5];
        figers [0] = new Circle ();
        figers [1] = new Rhombus ();
        figers [2] = new Trapezium ();
        figers [3] = new Triangle ();
        figers [4] = new Rectangle ();
        
        int i = rand.nextInt(5);
        
         return figers [i];
        /*
         * TODO: Реализовать метод 'getInstance()' класса 'RandomShapeFactory'
         */
    }
    
   
}
