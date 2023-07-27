package com.example;

public class TriangleExample6 {

	interface Shape {
		boolean test(int i, int j);
	}
	
	static void drawShape(Shape s, int n) {
		System.out.println(n + ".");
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
	}
	
	public static void main(String[] args) {
		drawShape(new Shape() {
			@Override
			public boolean test(int i, int j) {
				return i >= j;
			}
		}, 1);

		drawShape(new Shape() {
			@Override
			public boolean test(int i, int j) {
				return i <= j;
			}
		}, 2);
		
		drawShape(new Shape() {
			@Override
			public boolean test(int i, int j) {
				return i+j <= 4;
			}
		}, 3);
		// i+j <= 4
		
		drawShape(new Shape() {
			@Override
			public boolean test(int i, int j) {
				return i+j >= 4;
			}
		}, 4);
		// i+j >= 4
		
		drawShape(new Shape() {
			public boolean test(int i, int j) {
				return i==0||i==4||j==0||j==4;
			}
		}, 5);
		
		drawShape((int i, int j) -> i == j || i + j == 4, 6);
		
	}
}
