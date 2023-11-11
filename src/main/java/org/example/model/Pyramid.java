package org.example.model;

public class Pyramid extends Shape{
    private double height;
    private double square;
    public Pyramid(double height, double square){
        super(height * square * 4/3);
        this.height = height;
        this.square = square;
    }
}
