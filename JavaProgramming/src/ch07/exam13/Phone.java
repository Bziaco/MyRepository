package ch07.exam13;

public abstract class Phone {
	public String number;

	public abstract void ring(); //�߻�Ŭ���� �ȿ��� �߻�޼ҵ尡 �־�� �Ѵ�.

	public void sendVoice() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}

	public void receiveVoice() {
		System.out.println("��ȭ�� �޽��ϴ�.");
	}
}
