package basic0803_1;

public class Account {

	private String ownerName = "";
	private int accountNumber = 0;
	private int balance = 0;

	String getOwnerName() {
		return this.ownerName;
	}

	int getAccountNumber() {
		return this.accountNumber;
	}

	int getBalance() {
		return this.balance;
	}

	void setOwnerName(String name) {
		ownerName = name;
	}

	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	void setBalance(int balance) {
		this.balance = balance;
	}

	// 잔고를 주어진 입금액만큼 증가
	public void deposit(int money) {
		balance += money;
	}

	// 잔고를 주어진 출금액만큼 감소
	public void withdraw(int money) {
		if (money > balance)
			System.out.println("잔고가 부족합니다.");
		else
			balance -= money;
	}

	public String toString() {

		String resultString = "";
		resultString = "예금주 이름 : " + getOwnerName() + "\n계좌번호 : " + getAccountNumber() + "\n잔고 : " + getBalance();
		return resultString + "\n";

	}

}
