package ch09.exam12;

public class AnonymousTest {
	private RemoteControl rc = new RemoteControl(){};  //�ʵ带 �ʱ�ȭ
	
	
	public AnonymousTest(){
		RemoteControl rc = new RemoteControl(){};   //���� �ʱ�ȭ
	}
	
	public void method1(RemoteControl rc){
		
	}
	
	public void method2(){
		method1(new RemoteControl() {
			
		});
	}
}
