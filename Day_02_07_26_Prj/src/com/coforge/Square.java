package com.coforge;

public class Square extends Shape {
    private double side;
    public Square(){
        super();
    }
    public Square(double side){
        this.side=side;
    }

    public void area(){
        System.out.println("area :" +  side * side);

    }
    public void perimeter(){
        System.out.println("permeter :"+ 4 * side);
    }
}
