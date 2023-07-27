package com.example;

public class TriangleExample2 {

	static class Show {
		boolean isDraw(int i, int j) {
			return i >= j;
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
		Show s1 = new Show();
		
		drawShape(s1);
		
		Show s2 = new Show() {
			@Override
			boolean isDraw(int i, int j) {
				return i<=j;
			}
		};
		
		drawShape(s2);
		
		drawShape2((int i, int j)-> i>=j );
			
//		drawShape(s1);
//		drawShape(s1);
//		drawShape(s1);
		
	}
}
