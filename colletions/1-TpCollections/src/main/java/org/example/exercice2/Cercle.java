package org.example.exercice2;

public class Cercle {
    private int x, y;
    double rayon;

    public Cercle(int x, int y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public String toString() {
        return "Coordonnées{" +
                "x=" + x +
                ", y=" + y +
                ", rayon=" + rayon +
                '}';
    }
}
