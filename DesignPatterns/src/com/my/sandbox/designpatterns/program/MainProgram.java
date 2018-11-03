package com.my.sandbox.designpatterns.program;

import com.my.sandbox.designpatterns.patterns.singleton.Singleton;
import com.my.sandbox.designpatterns.patterns.strategy.objects.Bird;
import com.my.sandbox.designpatterns.patterns.strategy.objects.Dog;
import com.my.sandbox.designpatterns.patterns.strategy.strategies.CanFly;

public class MainProgram {

	public static void main(String[] args) {
		System.out.println("Singleton test:\n");
		SingletonExample();
		
		System.out.println("=====================================================================================\n");
		System.out.println("Strategy test:\n");
		StrategyExample();
	}
	
	public static void SingletonExample() {
		Singleton singleton1 = Singleton.getInstance();
		singleton1.setTestField("Hello World!");
		System.out.println(String.format("Field value in the First Singleton: %s", singleton1.getTestField()));
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(String.format("Field value in the Second Singleton: %s", singleton2.getTestField()));
		
		singleton2.setTestField("The Field was changed from the Second Singleton");
		System.out.println(String.format("Field value in the First Singleton: %s", singleton1.getTestField()));
		System.out.println(String.format("Field value in the Second Singleton: %s", singleton2.getTestField()));
	}
	
	public static void StrategyExample() {
		Dog barky = new Dog("Barky");
		System.out.println(barky.introduce());
		
		Bird tweety = new Bird("Tweety");
		System.out.println(tweety.introduce());
		
		System.out.println("Let's show how to fly to the Dog to make him happy! J");
		barky.setFlyingAbility(new CanFly());
		System.out.println(barky.introduce());
		
		System.out.println("Let's assume that a bird has only onle wing.");
		Bird oneWingedBird = new Bird("OneWinged", false);
		System.out.println(oneWingedBird.introduce());
	}
}