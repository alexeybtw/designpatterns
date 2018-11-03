package com.my.sandbox.designpatterns.patterns.strategy.objects;

import com.my.sandbox.designpatterns.patterns.strategy.strategies.CanFly;

public class Bird extends Animal {
	
	public Bird(String name) {
		super(name);
		setFlyingAbility(new CanFly());
	}
	
	public Bird(String name, boolean initCanFly) {
		super(name, initCanFly);
	}
}