package ch08.exam01;

public class Television implements RemoteControl{ //������� ����Ʈ��Ʈ�ѷ� ����Ҽ� �ִ� 

	@Override //�������̽��� �߻�޼ҵ尡 �߱����Ǿ� �ִ����� �˻��ϴ� ���
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("���� TV ����: " + volume);
	}
	
}
