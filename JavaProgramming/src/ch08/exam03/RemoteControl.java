package ch08.exam03;

public interface RemoteControl {
	//Constant
	int MAX_VOLUME = 10;   //����� ���������� �빮�ڷ� �ۼ��Ѵ�.
	int MIN_VOLUME = 1;
	
	//Abstract Method
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//Default Method
	default void setMute(boolean mute){
		if(mute){
			System.out.println("���� ó���մϴ�.");
		} else{
			System.out.println("���� �����մϴ�.");
		}
	} 
	
	
	//Static Method
	static void changeBattery(){
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
