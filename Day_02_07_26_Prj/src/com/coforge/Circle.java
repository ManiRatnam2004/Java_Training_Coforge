package com.coforge;

public class Circle extends Shape {
    private double radius;
    public Circle(){
        super();
    }
    public Circle(double radius){
        this.radius =radius;
    }

    public void area(){
        System.out.println("area :" + Math.PI * radius  * radius);

    }
    public void perimeter(){
        System.out.println("permeter :"+ 2 * Math.PI * radius);
    }
}

