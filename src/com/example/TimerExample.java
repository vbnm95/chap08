package com.example;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
	static class randTask extends TimerTask {
		@Override
		public void run() {
			System.out.println((char)(Math.random()*26 + 'A'));
		}
	}
	public static void main(String[] args) {
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Anonymous run...");
			}
		}, 0, 2000);
		
		timer.schedule(new randTask(), 0, 1000);
		
	}
}
