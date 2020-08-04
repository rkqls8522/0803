package basic0803_1;

public class Player {

//	PairOfDice dice = new PairOfDice();
	
	private String name;
	private int total;
	
	String getName() {return name;}
	void setName(String name) {this.name=name;}
	int getTotal() {return total;}
	void setTotal(int total) {this.total=total;}
	
	Player(String name){
		setName(name);
		total = 0;
	}
	
	public void roll(PairOfDice dice) {
		dice.roll();
		int value1 = dice.getFaceValue1();
		int value2 = dice.getFaceValue2();
		total = value1+value2;
		System.out.println("value1 : " + value1 + "\nvalue2 : " + value2 + "\ntotal : " + total);
	}
	
	
	
}
