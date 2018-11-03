package com.my.sandbox.designpatterns.patterns.strategy.objects;

import com.my.sandbox.designpatterns.patterns.strategy.strategies.CanFly;
import com.my.sandbox.designpatterns.patterns.strategy.strategies.CannotFly;
import com.my.sandbox.designpatterns.patterns.strategy.strategies.IFlying;

public class Animal {
	
	private String name;
	private double weight;
	private double high;
	private IFlying flyingAbility;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, boolean initCanFly) {
		this.name = name;
		this.flyingAbility = initCanFly ? new CanFly() : new CannotFly();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public IFlying getFlyingAbility() {
		return flyingAbility;
	}

	public void setFlyingAbility(IFlying flyingAbility) {
		this.flyingAbility = flyingAbility;
	}
	
	public String introduce() {
		return String.format("Hello World. I'm %s. And %s", this.name, this.flyingAbility.flyingAbility());
	}
}