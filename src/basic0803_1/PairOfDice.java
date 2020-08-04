package basic0803_1;

public class PairOfDice {

	int faceValue1;
	int faceValue2;
	
	PairOfDice(){
		faceValue1 = 1;
		faceValue2 = 1;
	}
	
	public void roll() {
		faceValue1 = (int)(Math.random()*6) +1;
		faceValue2 = (int)(Math.random()*6) +1;
	}
	
	int getFaceValue1() {
		return faceValue1;
	}
	int getFaceValue2() {
		return faceValue2;
	}
	
	
	
}
