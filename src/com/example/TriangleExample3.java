package com.example;

public class TriangleExample3 {

	static class Show {
		boolean isDraw(int i, int j) {
			return i >= j;
		}
	}
	
	static class Triangle1 extends Show {
		boolean isDraw(int i, int j) {
			return i >= j;
		}
	}
	
	static class Triangle2 extends Show {
		boolean isDraw(int i, int j) {
			return i <= j;
		}
	}
	
	static class Triangle3 extends Show {
		boolean isDraw(int i, int j) {
			return i+j <= 4;
		}
	}
	
	static class Triangle4 extends Show {
		boolean isDraw(int i, int j) {
			return i+j >= 4;
		}
	}
	
	static class Rectangle extends Show {
		boolean isDraw(int i, int j) {
			return i==0||i==4||j==0||j==4;
		}
	}
	
	static class Cross extends Show {
		boolean isDraw(int i, int j) {
			return i==j||i+j==4;
		}
	}
	
	static void drawShape(Show s) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(s.isDraw(i, j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static interface Showable {
		boolean isDraw(int i, int j);
	}
	
	static void drawShape2(Showable s) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(s.isDraw(i, j)) {
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
		Show s = new Triangle1();
		drawShape(s);
		
		s= new Triangle2();
		drawShape(s);
		
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
