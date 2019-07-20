package com.skilldistillery.lordoftheobjects;

public class Player1 extends Participants {
	protected int attack2;
	protected int attack3;
	protected int attack4;

	public Player1() {

	}

	public Player1(int hp, int attack1, int attack2, int attack3, int attack4) {
		this.attack2 = attack2;
		this.attack3 = attack3;
		this.attack4 = attack4;

	}

	public int attack1(int foeHp) {
		foeHp -= attack1;
		return foeHp;
	}

	public int attack2(int foeHp) {
		foeHp -= attack2;

		return foeHp;
	}

	public int attack3(int foeHp) {
		foeHp -= attack3;

		return foeHp;
	}

	public int attack4(int foeHp) {
		foeHp -= attack4;

		return foeHp;
	}

	public void searchesForRewards() {

	}

}
