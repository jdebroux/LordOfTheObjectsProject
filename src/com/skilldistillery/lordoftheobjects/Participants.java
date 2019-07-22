package com.skilldistillery.lordoftheobjects;

public class Participants {
	protected int hp;
	protected int attack1;
	protected String name;

	public Participants() {

	}

	public Participants(int hp, int attack1) {
		this.hp = hp;
		this.attack1 = attack1;
	}

	public int battle(int hp, int foeHp) {

		return hp;
	}

	public boolean amIAlive(int hp) {
		if (hp > 0) {
			return true;
		} else
			return false;
	}
}
