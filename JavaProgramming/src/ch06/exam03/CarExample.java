package ch06.exam03;

public class CarExample {
	public static void main(String[] args) {
		//Car ���� ����
		Car myCar = null;
		//Car ��ü�� �����ϰ� ��ġ ���� ���
		try{
			myCar = new Car();
		} catch (Exception e){}
		//��ü �ִ��� ����
		if(myCar != null){
			System.out.println("Car ��ü ����");
		}else{
			System.out.println("Car ��ü ����");
		}
		
		//��ü������ �ʵ尪�� �о��
		System.out.println(myCar.company);
		//��ü ������ �ʵ尪�� ����
		myCar.company = "KOSA";
		System.out.println(myCar.company);
			
		//��ü ������ �޼ҵ带 ȣ���� ����
		myCar.run();
		
	}
}
