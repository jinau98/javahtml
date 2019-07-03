package test;

public class Timo {
	final String name="티모";
	String username;
	int attack;
	int armor;
	String spell;
	
	//생성자 (기본 생성자는 생략되어 있다. 초기화시키는 역할
	//this는 객체가 들고 있는 변수
	public Timo(String username, int attack, int armor, String spell) {
		this.username = username;
		this.attack = attack;
		this.armor = armor;
		this.spell = spell;
	}
}
