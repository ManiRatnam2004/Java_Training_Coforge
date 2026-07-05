package com.coforge;



public class ShapeMain {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//         // instance not required,  make class abstract
//
//        shape.area();
//        shape.perimeter();

        Shape sh1 = new Square(4);
        sh1.area();
        sh1.perimeter();


//        write code for
        // sh1= new Circle(7);
        // sh1= new Rectangel(5,6);
        
        sh1 = new Circle(7);
        sh1.area();
        sh1.perimeter();
        
        
        // rectangle
        
        sh1 = new Rectangle(5,6);
        sh1.area();
        sh1.perimeter();
        
    }
}
