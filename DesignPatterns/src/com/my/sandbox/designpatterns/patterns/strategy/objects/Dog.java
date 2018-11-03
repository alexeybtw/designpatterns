package com.my.sandbox.designpatterns.patterns.strategy.objects;

import com.my.sandbox.designpatterns.patterns.strategy.strategies.CannotFly;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
		setFlyingAbility(new CannotFly());
	}

	public Dog(String name, boolean initCanFly) {
		super(name, initCanFly);
	}
}