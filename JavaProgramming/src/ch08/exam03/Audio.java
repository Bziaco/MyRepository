package ch08.exam03;

public class Audio implements RemoteControl{
	
		@Override //�������̽��� �߻�޼ҵ尡 �߱����Ǿ� �ִ����� �˻��ϴ� ���
		public void turnOn() {
			System.out.println("Audio�� �մϴ�.");
		}

		@Override
		public void turnOff() {
			System.out.println("Audio�� ���ϴ�.");
		}

		@Override
		public void setVolume(int volume) {
			System.out.println("���� Audio ����: " + volume);
		}
}
