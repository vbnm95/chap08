package com.example;

public class TriangleExample {

	static void triangle1() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void triangle2() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void triangle3() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j<=4 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void triangle4() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j>=4 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void rectangle() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==0 || i==4 || j==0 || j==4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void cross() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==j || i+j==4) {
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
		triangle1();
		triangle2();
		triangle3();
		triangle4();
		rectangle();
		cross();
		
	}
}
