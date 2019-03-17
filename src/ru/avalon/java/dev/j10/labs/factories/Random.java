package ru.avalon.java.dev.j10.labs.factories;

//Класс генерирует псевдослучайные числа в диапазоне [0;upperLimit)
public class Random {
    private int upperLimit;

    public Random(int upperLimit){
        this.upperLimit = upperLimit;
    }

    public int next(){
        return (int)(Math.random()*upperLimit);
    }
}
