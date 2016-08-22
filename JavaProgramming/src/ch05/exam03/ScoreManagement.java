package ch05.exam03;

import java.util.Scanner;

public class ScoreManagement {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�л���: ");
		String strNum = scanner.nextLine();
		int num = Integer.parseInt(strNum);
		String[][] scores = new String[num][2];

		for (int i = 0; i < scores.length; i++) {
			System.out.print("�̸�: ");
			String name = scanner.nextLine();
			System.out.print("����: ");
			String score = scanner.nextLine();
			String[] arr = { name, score };
			scores[i] = arr;
		}

		while (true) {
			System.out.println("---------------------------");
			System.out.println("1.�� �л��� | 2.�Է� | 3.�ְ����� | 4.������� | 5.����");
			System.out.println("---------------------------");
			System.out.print("����> ");
			String choiceNum = scanner.nextLine();

			if (choiceNum.equals("1")) {
				
			}else if (choiceNum.equals("2")) {
				
			} else if (choiceNum.equals("3")) {
				int max = 0;
				for (String[] arr : scores) { // �ְ����� ã��
					if (max < Integer.parseInt(arr[1])) {
						max = Integer.parseInt(arr[1]);
					}
				}

				for (String[] arr : scores) { // ���� �ְ������� �̸�ã��
					if (max == Integer.parseInt(arr[1])) {
						System.out.println(arr[0] + ", " + arr[1]);
					}
				}
			} else if (choiceNum.equals("4")) {
				int sum = 0;
				for (String[] arr : scores) {
					sum += Integer.parseInt(arr[1]);
				}
				int avg = sum / scores.length;

				System.out.println("�������: " + avg);
			} else if (choiceNum.equals("5")) {
				break;
			}
		}
	}
}
