package ch07.exam01;

public class Machine {
	public String kind;
	public String maker;
	
	
	public Machine() {
		System.out.println("Machine() �����");
	}
	
	
	
	public void powerOn(){
		System.out.println(maker + " : " + kind + "����");
	}
	public void powerOff(){
		System.out.println(maker + " : " + kind + "����");
	}
}
