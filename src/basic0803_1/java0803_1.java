package basic0803_1;

public class java0803_1 {

	public static void main(String[] args) {

//		Account test = new Account();
//		test.setOwnerName("ȫ�浿");
//		test.setAccountNumber(101);
//		test.setBalance(10000);
//		System.out.println(test);
//		
//		test.deposit(3000);
//		System.out.println(test);
//
//		test.withdraw(5000);
//		System.out.println(test);

		
//		Student[] student = new Student[2];
//		
//		student[0] = new Student();
//		student[0].setName("����");
//		student[0].setAssingmentScore(91);
//		student[0].setExamScore(84);
//		System.out.println(student[0]);
//		
//		student[1] = new Student();
//		student[1].setName("����");
//		student[1].setAssingmentScore(86);
//		student[1].setExamScore(95);
//		System.out.println(student[1]);
	
//		PairOfDice dice = new PairOfDice();
//		int result;
//		for(int i = 0; i <10; i++) {
//			dice.roll();
//			result = dice.getFaceValue1() + dice.getFaceValue2();
//			System.out.println(result);
//			
//		}
		
		Player player1 = new Player("����");
		Player player2 = new Player("�ִ�");
		Driver driver = new Driver();
		do {
			System.out.println(player1.getName()+"�� �ֻ����� �����ϴ�.");
			player1.roll(new PairOfDice());
			System.out.println(player2.getName()+"�� �ֻ����� �����ϴ�.");
			player1.roll(new PairOfDice());
			if(player1.getTotal() > player2.getTotal())
				System.out.println(player1.getName() + "�� �̰���ϴ�.");
			else if(player1.getTotal() < player2.getTotal())
				System.out.println(player2.getName() + "�� �̰���ϴ�.");
			else System.out.println("�����Դϴ�.");
			
			System.out.println("��� �Ͻðڽ��ϱ�?");
		}while(sc.next())
			
		
	}

}
