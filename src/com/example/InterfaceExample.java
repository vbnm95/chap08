package com.example;

import java.util.TimerTask;

public class InterfaceExample {
	
	static class A {  //  일반 클래스
		class AA {
			
		}
		
		static int count;
		int num;
		
		public A() {
		
		}
		
		static {
			
		}
		
		void show() {
			
		}
		
		static int getCount() {
			return count;
		}
	}
	
	static abstract class B { // 추상클래스
		static int count;
		int num;
		
		static {
			
		}
		
		public B() {
			// 상속되면서 호출
		}
		
		void show() {
			
		}
		
		static int getCount() {
			return count;
		}
		
		abstract void hide(); // 추상메소드
		
	}
	
	static class AA extends A {
		
	}
	
	static class BB extends B {
		@Override
		void hide() {
			
		}
	}
	
	static class Task extends TimerTask {
		@Override
		public void run() {
			
		}
	}
	
	static abstract class D { // 순수 추상클래스
		abstract void show();
		abstract void hide();
	}
	
	static class DD extends D {
		@Override
		void show() {
			
		}
		@Override
		void hide() {
			
		}
	}
	
	interface Showable {
		int count = 0;
		String str = "UP";
		
		void show();
		
		void hide();
		
		default void move() {
			System.out.println("default move");
		}
		
		static void run() {
			System.out.println("static run");
		}
		
	}
	
	interface Moveable {
		void left();
		void right();
		void up();
		void down();
	}
	
	static class E implements Showable, Moveable {
		@Override
		public void show() {
			System.out.println("Showable show");
		}
		@Override
		public void hide() {
			
		}
		@Override
		public void left() {
			
		}
		@Override
		public void right() {
			System.out.println("Moveable right");
		}
		@Override
		public void up() {
			
		}
		@Override
		public void down() {
			
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
//		B b = new B();

		A a1 = new AA();
		B b1 = new BB();
		D d1 = new DD();
		
//		Showable s = new Showable();
		Showable ss = new E();
		Moveable mm = new E();
		
		ss.show();
		ss.move();
		
		mm.right();
		
		Showable.run();

	}

}
