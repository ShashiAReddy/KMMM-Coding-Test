package com.java.learn;

public class Square implements Shape {

	private final double side;
	
	public Square(){
		this(1);
	}
	public Square(double i) {
		side=i;
	}
	public double area() {
		
		return (side*side);
	}

	
	public double perimeter() {
		
		return (4*side);
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	

}
