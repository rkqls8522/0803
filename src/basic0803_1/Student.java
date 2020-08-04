package basic0803_1;

public class Student {

	private String name = "";
	private int assingmentScore = 0;
	private int examScore = 0;
	
	String getName() {
		return name;
	}
	int getAssingmentScore() {
		return assingmentScore;
	}
	int getExamScore() {
		return examScore;
	}
	void setName(String name) {
		this.name = name;
	}
	void setAssingmentScore(int score) {
		assingmentScore = score;
	}
	void setExamScore(int score) {
		examScore = score;
	}
	
	public char getGrade() {
		char ch;
		double total;
		total = assingmentScore*0.4 + examScore*0.6;
		if(total >= 90)
			ch = 'A';
		else if(total >= 80)
			ch = 'B';
		else if(total >= 70)
			ch = 'C';
		else if(total >= 60)
			ch = 'D';
		else ch = 'F';
		
		return ch;
	}
	
	@Override
	public String toString() {
		
		String str = "";
		str = "이름 : " + getName() + "\n과제점수 : " + getAssingmentScore() + "\n시험점수 : " + getExamScore() + "\n학점 : " + getGrade();
		return str + "\n";
		
	}
	
}
