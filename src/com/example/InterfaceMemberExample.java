package com.example;

public class InterfaceMemberExample {

	interface Moveable {
		int BLACK = 0; // public static final
		void move(); // public abstract
		
		default void xxx() {
			System.out.println("Moveable.xxx()");
		}
		
		static void zzz() {
			System.out.println("Moveable.zzz()");
		}
	}
	
	static class A implements Moveable {
		@Override
		public void move() {
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Moveable.BLACK);
		A a = new A();
		a.xxx();
		
		Moveable.zzz();
	}
}
