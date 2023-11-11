package org.example.model;

import java.util.ArrayList;

public class Box extends Shape{
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double avilable;
    public Box(double avilable){
        super(avilable);
        this.avilable = avilable;
    }
    public boolean add(Shape shape){
        if(avilable >= shape.getVolume()){
            shapes.add(shape);
            avilable -= shape.getVolume();
            return true;
        }
        else return false;
    }
}
