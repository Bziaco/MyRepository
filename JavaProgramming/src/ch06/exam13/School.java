package ch06.exam13;

public class School {
	private static School school = new School();
	
	private School(){
		
	}
	
	static School getInstance(){ //School.school = null;�� ���� ���� ���
		return school;
	}
}
