package ch07.exam15;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------");
			System.out.print("����>");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("���α׷� ����");
	}

	// ���»����ϱ�
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("���»���");
		System.out.println("-------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine();
		
		System.out.print("������: ");
		String owner = scanner.nextLine();
		
		System.out.print("�ʱ��Աݾ�: ");
		int balance = Integer.parseInt(scanner.nextLine());
	
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null){
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
		
		
	}
	
	//���¸�Ϻ���
	private static void accountList() {
		
	}
	
	//�����ϱ�
	private static void deposit() {

	}
	
	//����ϱ�
	private static void withdraw() {

	}

}
