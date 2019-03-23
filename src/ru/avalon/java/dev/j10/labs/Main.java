package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.factories.RandomShapeFactory;
import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class Main {
static float sideOne; // первая сторона треугольника
 static    float sideTwo; // вторая сторона треугольника
   static  float sideThree; // третья сторона треугольника
   
    public static void main(String[] args) {
        RandomShapeFactory factory = new RandomShapeFactory();

        Shape[] shapes = new Shape[20];
            
        for (int i = 0; i<shapes.length; i++){
          shapes [i] = factory.getInstance();
          
        }
        
        float [] ar = new float [20];
         for (int k = 0; k<ar.length; k++) {
         ar [k] = shapes [k].getArea();
         
         }   
            
         boolean sort = false;
        float t;
        while(!sort) {
            sort = true;
            for (int i = 0; i < ar.length-1; i++) {
                if(ar[i] > ar[i+1]){
                    sort = false;
                     t = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = t;
                     }
       
            }
        
    
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать элементы массива 'shapes'
         *    20-ю случайными фигурами.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью.
         */
    }
      /*
        Выводим в стороку последнюю переменную отсортированного массива. Она пренадлежит фигуре с самой большой площадью.
        */ 
      
    System.out.println(ar[19]);
    }
}