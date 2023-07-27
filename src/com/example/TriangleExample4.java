package com.example;

public class TriangleExample4 {

	static abstract class Shape {
		abstract boolean test(int i, int j);
	}
	
	static class Triangle1 extends Shape {
		boolean test(int i, int j) {
			return i >= j;
		}
	}
	
	static class Triangle2 extends Shape {
		boolean test(int i, int j) {
			return i <= j;
		}
	}
	
	static class Triangle3 extends Shape {
		boolean test(int i, int j) {
			return i+j <= 4;
		}
	}
	
	static class Triangle4 extends Shape {
		boolean test(int i, int j) {
			return i+j >= 4;
		}
	}
	
	static class Rectangle extends Shape {
		boolean test(int i, int j) {
			return i==0||i==4||j==0||j==4;
		}
	}
	
	static class Cross extends Shape {
		boolean test(int i, int j) {
			return i==j||i+j==4;
		}
	}
	
	static void drawShape(Shape s) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(s.test(i, j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Shape s = new Triangle1();
		drawShape(s);
		
		drawShape(new Triangle2());
		
		s= new Triangle3();
		drawShape(s);
		
		s= new Triangle4();
		drawShape(s);
		
		s= new Rectangle();
		drawShape(s);
		
		s= new Cross();
		drawShape(s);
		
	}
}
