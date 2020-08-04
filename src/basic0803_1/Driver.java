package basic0803_1;

import java.util.Scanner;

public class Driver {

	private String flag;

	String getFlag() {
		return this.flag;
	}

	void setFlag(String flag) {
		this.flag = flag;
	}

	Scanner sc = new Scanner(System.in);

	String answer() {
		String ans = sc.next();
		setFlag(ans);
		return flag;
	}

}
