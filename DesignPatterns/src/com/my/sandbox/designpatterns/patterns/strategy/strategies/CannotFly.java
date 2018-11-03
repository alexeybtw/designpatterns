package com.my.sandbox.designpatterns.patterns.strategy.strategies;

public class CannotFly implements IFlying {
	
	@Override
	public String flyingAbility() {
		return "I cannot fly :(";
	}
}