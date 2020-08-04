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

	// �ܰ� �־��� �Աݾ׸�ŭ ����
	public void deposit(int money) {
		balance += money;
	}

	// �ܰ� �־��� ��ݾ׸�ŭ ����
	public void withdraw(int money) {
		if (money > balance)
			System.out.println("�ܰ� �����մϴ�.");
		else
			balance -= money;
	}

	public String toString() {

		String resultString = "";
		resultString = "������ �̸� : " + getOwnerName() + "\n���¹�ȣ : " + getAccountNumber() + "\n�ܰ� : " + getBalance();
		return resultString + "\n";

	}

}
