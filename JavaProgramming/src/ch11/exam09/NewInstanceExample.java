package ch11.exam09;

public class NewInstanceExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("ch11.examp09" + args[0]); //forName���� ������ ������ ��. ��ü�� �ȸ������
		Object obj = clazz.newInstance(); //forName���� ���� ������ �������� ��ü�� ����
		Action action = (Action) obj;     //obj�� ��ü������ ��. Action �������̽��� Ÿ�Ժ�ȯ�ؼ� ����ϴ� ����
		action.execute();
		
	}
}
