package com.coforge;

public class Rectangle extends Shape {
    private double len;
    private double bre;
    public Rectangle(){
        super();
    }
    public Rectangle(double len , double bre){
        this.len =len;
        this.bre=bre;
    }

    public void area(){
        System.out.println("area :" + len  * bre);

    }
    public void perimeter(){
        System.out.println("permeter :"+ 2 * (len + bre));
    }
}

