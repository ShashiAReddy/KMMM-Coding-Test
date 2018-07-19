package com.java.learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Application {
    public static void main(String[] args) {

        // Rectangle 
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        // Circle 
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.area()
            + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        // Triangle 
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
        
        //Square 
        double side=3;
        Shape square=new Square(side);
        System.out.println("Square side is : " + side + "\n Resulting Area : " + square.area()
        + "\n Resulting Perimeter : " + square.perimeter()+"\n");
        
        List<Shape> myList= Arrays.asList(new Shape[]{rectangle,circle,triangle,square});

        
        List<Shape> sortedList=myList.stream().sorted(
        		(shape1,shape2)->{
        			
        			if(shape1.area()<shape2.area()) {
        				return -1;
        			}else if(shape1.area()>shape2.area()) {
        				return 1;
        				
        			}else {
        				return 0;
        			}       			
        		}).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
