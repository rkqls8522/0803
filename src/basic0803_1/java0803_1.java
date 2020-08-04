package basic0803_1;

public class java0803_1 {

	public static void main(String[] args) {

//		Account test = new Account();
//		test.setOwnerName("홍길동");
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
//		student[0].setName("선남");
//		student[0].setAssingmentScore(91);
//		student[0].setExamScore(84);
//		System.out.println(student[0]);
//		
//		student[1] = new Student();
//		student[1].setName("선녀");
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
		
		Player player1 = new Player("가빈");
		Player player2 = new Player("밍다");
		Driver driver = new Driver();
		do {
			System.out.println(player1.getName()+"이 주사위를 던집니다.");
			player1.roll(new PairOfDice());
			System.out.println(player2.getName()+"이 주사위를 던집니다.");
			player1.roll(new PairOfDice());
			if(player1.getTotal() > player2.getTotal())
				System.out.println(player1.getName() + "이 이겼습니다.");
			else if(player1.getTotal() < player2.getTotal())
				System.out.println(player2.getName() + "이 이겼습니다.");
			else System.out.println("동점입니다.");
			
			System.out.println("계속 하시겠습니까?");
		}while(sc.next())
			
		
	}

}
