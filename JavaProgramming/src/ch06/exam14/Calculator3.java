package ch06.exam14;

public class Calculator3 {
		
		final int field2; //fianl �ʵ尪�� ���� �ʾ��� ��쿡�� ���� �ѹ� �ʱ�ȭ�� ���ִ�. 
		
		Calculator3(int field2){
			this.field2 = field2;
		}
		
		public static void main(String[] args) {
			Calculator3 ca1 = new Calculator3(5); //�ֹι�ȣ,id�� ���� ���µ��� �ѹ� ���� �ְ� �����Ҽ� ������ �� �� �ִ�.
			Calculator3 ca2 = new Calculator3(7);
		}
}
