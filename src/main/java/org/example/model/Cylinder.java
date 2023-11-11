package org.example.model;

public class Cylinder extends SolidOfRev{
    private double height;
    public Cylinder(double radius, double height){
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }

}
