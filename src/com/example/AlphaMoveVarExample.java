package com.example;

import java.util.Timer;
import java.util.TimerTask;

import util.Alpha;
import util.VT100;

public class AlphaMoveVarExample {
	enum Direction {
		RIGHT, LEFT, UP, DOWN
	}
	
	static class AlphaMove extends Alpha {
		Direction direc;
		
		public AlphaMove() {
			show();
			this.direc = Direction.values()[(int)(Math.random()*4)]; 
		}
		
		public AlphaMove(int line, int column) {
			this.line = line;
			this.column = column;
			show();
			this.direc = Direction.values()[(int)(Math.random()*4)]; 
		}
		
		void right() {
			hide();
			column++;
			show();
		}
		
		void left() {
			hide();
			column--;
			show();
		}
		
		void up() {
			hide();
			line--;
			show();
		}
		
		void down() {
			hide();
			line++;
			show();
		}
		
		void move() {
			switch(direc) {
			case RIGHT :
				right();
				break;
				
			case LEFT:
				left();
				break;
				
			case UP:
				up();
				break;
				
			case DOWN:
				down();
				break;
				
			default:
				break;
			}
		}
		
	}
	
	static class RectangleTask extends TimerTask {
		AlphaMove a = new AlphaMove(1, 1);
		
		@Override
		public void run() {
			
			if(a.getLine() == 1 && a.getColumn() == 1)
				a.direc = Direction.RIGHT;
			else if(a.getLine() == 1 && a.getColumn() == 40)
				a.direc = Direction.DOWN;
			else if(a.getLine() == 20 && a.getColumn() == 40)
				a.direc = Direction.LEFT;
			else if(a.getLine() == 20 && a.getColumn() == 1)
				a.direc = Direction.UP;
			
			synchronized (System.out) {
				a.move();
			}
		}
	}
	
	static class BlinkTask extends TimerTask {
		AlphaMove a = new AlphaMove();
		boolean isTrue;
		
		@Override
		public void run() {
			if(isTrue)
				a.show();
			else
				a.hide();
			
			isTrue = !isTrue;
		}
	}
	
	static class WormTask extends TimerTask {
		int moveCount;
		AlphaMove a = new AlphaMove();
		
		@Override
		public void run() {
			
			if(a.getLine() == 1 && a.direc == Direction.UP)
				a.direc = Direction.DOWN;
			else if(a.getLine() == 20 && a.direc == Direction.DOWN)
				a.direc = Direction.UP;
			else if(a.getColumn() == 1 && a.direc == Direction.LEFT)
				a.direc = Direction.RIGHT;
			else if(a.getColumn() == 40 && a.direc == Direction.RIGHT)
				a.direc = Direction.LEFT;
			
			synchronized (System.out) {
				a.move();
			}
			
			moveCount++;
			
			if(moveCount == 5) {
				a.direc = Direction.values()[(int)(Math.random()*4)];
				moveCount = 0;
			}
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		VT100.clearScreen();
		VT100.reset();
		
		Timer timer = new Timer();
		
		for(int i=0; i<50; i++) {
			int rand = (int)(Math.random()*50);
			
			if(0 <= rand && rand <= 30)
				timer.schedule(new RectangleTask(), 0, 200);
			else if(30 < rand && rand <= 40)
				timer.schedule(new BlinkTask(), 0, 300);
			else
				timer.schedule(new WormTask(), 0, 150);
			
			Thread.sleep(200);
		}
		
		Thread.sleep(10000);
		timer.cancel();
		VT100.reset();
		VT100.cursorMove(21, 1);
		System.out.println("Program End...");
	}
}
