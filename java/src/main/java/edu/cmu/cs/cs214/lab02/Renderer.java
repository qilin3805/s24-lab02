package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    private Shape shape;

    Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        double area = shape.getArea();
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
    // public Rectangle rectangle;
    
    // Renderer(Rectangle rectangle) {
    //     this.rectangle = rectangle;
    // }

    // void draw() {
    //     double area = rectangle.getArea();

    //     // assume implementation

    //     System.out.println("Shape printed\n" + "Its area is " + area);
    // }
