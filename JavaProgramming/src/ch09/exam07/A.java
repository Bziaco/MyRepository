package ch09.exam07;

public class A {
	int field;
	
	
	public void method(){

		class B{
			int field;
			B(){
				field = 20;
				this.field = 30;
				A.this.field = 40;


			}
		}
		B b = new B();
		System.out.println("B�� �ʵ�: " + b.field);
		System.out.println("A�� �ʵ�: " + field);
	}
}
