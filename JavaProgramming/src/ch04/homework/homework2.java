package ch04.homework;

public class homework2 {

	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) { //1~10���� 10�� �ݺ���
			for (int y = 1; y <= 10; y++) { // 1~10���� 10�� �ݺ���
				if((4*x) + (5*y) == 60){ //if������ ���ǽ��� �����Ѵٸ� if�� ��� ����  
					System.out.println("x�� : " + x + " " + "y�� : " + y); //if���� true�� ��� x�� y ���� ���
				}
			}
		}
	}

}
