package com.example;

public class TriangleExample5 {

	interface Shape {
		boolean test(int i, int j);
	}
	
	static class Triangle1 implements Shape {
		public boolean test(int i, int j) {
			return i >= j;
		}
	}
	
	static class Triangle2 implements Shape {
		public boolean test(int i, int j) {
			return i <= j;
		}
	}
	
	static class Triangle3 implements Shape {
		public boolean test(int i, int j) {
			return i+j <= 4;
		}
	}
	
	static class Triangle4 implements Shape {
		public boolean test(int i, int j) {
			return i+j >= 4;
		}
	}
	
	static class Rectangle implements Shape {
		public boolean test(int i, int j) {
			return i==0||i==4||j==0||j==4;
		}
	}
	
	static class Cross implements Shape {
		public boolean test(int i, int j) {
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
		
		s= new Triangle2();
		drawShape(s);
		
		s= new Triangle3();
		drawShape(s);
		
		s= new Triangle4();
		drawShape(s);
		
		drawShape(new Shape() {
			public boolean test(int i, int j) {
				return i==0||i==4||j==0||j==4;
			}
		});
		
		drawShape((int i, int j) -> i == j || i + j == 4);
		
		if(s instanceof Triangle1) {
			Triangle1 t = (Triangle1) s;
		}
		
		System.out.println(s instanceof Triangle1);
	}
}
