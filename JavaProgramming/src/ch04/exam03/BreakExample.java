package ch04.exam03;

public class BreakExample {
	public static void main(String[] args) {
		// �ֻ����� ���� 6�� ������ ���α׷��� �����ϼ���.
		while (true) {
			int num = (int) (Math.random()*6 + 1);
			System.out.println(num);
			
			if(num == 6){
				break;
			}
		}
	}
}
