package com.example;

public class AnonymousExample2 {

	interface Showable {
		void show();
		void hide();
	}
	
	static class A implements Showable {

		@Override
		public void show() {
			
		}

		@Override
		public void hide() {
			
		}
		
		public void move() {
			
		}
	}
	
	public static void main(String[] args) {
		Showable a = new A();
		a.show();
		a.hide();
		
		A aa = new A();
		aa.move();
		
		Showable b = new Showable() {
			
			@Override
			public void show() {
				
			}
			
			@Override
			public void hide() {
				
			}
			
			void left() {
				
			}
		};
		
		b.show();
		b.hide();
	}
}
