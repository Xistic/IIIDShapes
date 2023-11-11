package org.example.model;

public class SolidOfRev extends Shape{
    private double radius;
    public SolidOfRev(double volume, double radius){
        super(volume);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}
