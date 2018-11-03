package com.my.sandbox.designpatterns.patterns.strategy.strategies;

public class CanFly implements IFlying {
	
	@Override
	public String flyingAbility() {
		return "I believe I can fly... High! :)";
	}
}
