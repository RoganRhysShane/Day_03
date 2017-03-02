package com.tiy;

/**
 * Created by josh on 3/1/17.
 */
public class Beer {
	private int level;
	private int cost = 5;

	public Beer(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
