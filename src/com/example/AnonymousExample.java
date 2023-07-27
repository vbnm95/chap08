package com.example;

public class AnonymousExample {

	static abstract class A {
		abstract void show();
	}
	
	static class B extends A {
		@Override
		void show() {
			
		}
	}
	
	public static void main(String[] args) {
		A a1 = new B();
		
		A a2 = new A() {
			void show() {
				System.out.println("Anonymous.show()");
			};
		};
		
		a2.show();
		
	}
}
