package ch06.exam12;

public class StatiMember2 {
	static String filed;
	
	static String field;
	String field2;
	
	static{
		System.out.println("static block ����");
		field = "�ڹ�";
	}
	
	static void method(){
		
	}
	void method2(){
		field = "�ڹ�";
		field2 = "�ڹ�";
	}
	
	public static void main(String[] args) {
		field = "�ڹ�";
		//field2 = "�ڹ�"; ��ü�� ���̵� ��밡���ؾ� ������ �ν��Ͻ� �ʵ�� ��ü�� �־�� ��밡���ϱ� ������ ������ ��
		
		method();
		//method2();
		
		StatiMember2 sm = new StatiMember2();
		sm.field2 = "�ڹ�";
	}
}
