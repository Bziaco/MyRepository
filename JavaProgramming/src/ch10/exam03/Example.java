package ch10.exam03;

public class Example {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		System.out.println(account.getBalance());
		
		try {
			account.withdraw(10000);
			System.out.println("����� �Ǿ����ϴ�");
		} catch (BalanceInSufficientException e) {
			System.out.println("����� ���� �ʾҽ��ϴ�.");
		}
	}
}
