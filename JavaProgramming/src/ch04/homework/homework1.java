package ch04.homework;

public class homework1 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) { //0~99���� 100�� �ݺ��� ��
			int dice1 = (int) (Math.random() * 6 + 1); //0~6������ �������� int Ÿ���� dice1 ������ ����
			int dice2 = (int) (Math.random() * 6 + 1); //0~6������ �������� int Ÿ���� dice2 ������ ����
			if ((dice1 + dice2) == 10) { //dice1�� dice2�� �������� ���� 10�� ��� if����� ����
				System.out.println("dice1�� �� : " + dice1 + "  " + "dice2�� �� : " + dice2); //if���� true�� ��� dice1�� dice2 ���� ���
			}
		}

	}

}
