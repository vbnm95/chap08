package com.example;

public class SoundableExample {

	interface Soundable {
		String sound();
	}
	
	static class Cat implements Soundable {
		@Override
		public String sound() {
			return "야옹";
		}
	}
	
	static class Dog implements Soundable {
		@Override
		public String sound() {
			return "멍멍";
		}
	}
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
