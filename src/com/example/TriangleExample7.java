package com.example;

public class TriangleExample7 {

	interface Shape {
		boolean test(int i, int j);
	}
	
	static void drawShape(Shape s, int n) {
		System.out.println(n + ".\n");
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
		drawShape((i, j) -> i >= j, 1);

		drawShape((i, j) -> i <= j, 2);
		
		drawShape((i, j) -> i+j <= 4, 3);
		
		drawShape((i, j) -> i+j >= 4, 4);
		
		drawShape((i, j) -> i==0||i==4||j==0||j==4, 5);
		
		drawShape((i, j) -> i == j || i + j == 4, 6);
		
	}
}
