package ch09.exam06;

public class A {
	int field = 10;
	public void method(){
		//B b = new B(); �޼ҵ峻�ο����� ������ ������.
		final int local = 10;
		class B{
			void method(){
				field = 5;
				//local = 5;
				int result = local + field;
			}
		}
		
	}
}
