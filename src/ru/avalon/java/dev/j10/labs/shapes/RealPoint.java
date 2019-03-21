package ru.avalon.java.dev.j10.labs.shapes;

public class RealPoint implements Point {

    private float X;
    private float Y;

    public RealPoint(float X, float Y){
        this.X = X;
        this.Y = Y;
    }


    @Override
    public float getX() {
        return X;
    }

    @Override
    public float getY() {
        return Y;
    }
}
