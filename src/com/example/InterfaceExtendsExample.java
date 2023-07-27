package com.example;

public class InterfaceExtendsExample {
	interface Showable {
		void show();
		void hide();
	}
	
	interface Moveable {
		void left();
		void right();
		void up();
		void down();
	}
	
	interface Shapable extends Showable, Moveable{
		void move();
	}
	
	static class B implements Shapable {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void hide() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void left() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void right() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void up() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void down() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	static class A implements Moveable, Showable {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void hide() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void left() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void right() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void up() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void down() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
