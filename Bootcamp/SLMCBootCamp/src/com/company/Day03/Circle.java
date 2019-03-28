package com.company.Day03;

public class Circle {

    final static double PI =  3.1416;

    double radius;
    double circumference;
    double area;


    //Default Value of instance
    public Circle(){

    }

    /*public Circle(double radius){
        this.radius = radius;
    }*/

    public static double getPi(){
        return PI;
    }

    public Circle(double diameter){
        radius = diameter/2;
    }

    public double getArea(double radius){

        area = PI*Math.pow(radius,2);

        return area;

    }

    public double getCircumference(double radius){

        circumference = 2*PI*radius;

        return circumference;
    }

}
