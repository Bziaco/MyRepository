package ch05.exam01;

public class StringEqual {

		public static void main(String[] args) {
			String name1 = "�ڹ�";
			String name2 = "�ڹ�"	;	
			String name3 = new String("�ڹ�");
		
			System.out.println(name1 == name2); //���� ��
			System.out.println(name1 == name3);
			
			System.out.println(name1.equals(name2)); //���� ���ڿ�
			System.out.println(name2.equals(name2));
		}
}