package ch11.exam08;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException{
		//Class classCar = Car.class; //�޼ҵ念���� car�ڵ尡 ����� �޸� ������ ������ ����
		//Class classCar = Class.forName("ch11.exam07.Car");
		Car car = new Car();
		Class classCar = car.getClass();
		System.out.println(classCar.getName());
		System.out.println(classCar.getSimpleName());
		System.out.println(classCar.getPackage().getName());
	}
}
