package org.example;

import org.example.model.Ball;
import org.example.model.Box;
import org.example.model.Cylinder;
import org.example.model.Pyramid;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball(2.5);
        Cylinder cylinder = new Cylinder(3.2,5.1);
        Pyramid pyramid = new Pyramid(1,1);

        Box box = new Box(230);

        System.out.println(box.add(ball1));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
    }
}