package ch07.exam09;

public class Car {
	
	/*Tire[] tire = {
			new Tire("�տ���", 6),
			new Tire("�տ�����", 2),
			new Tire("�ڿ���", 3),
			new Tire("�ڿ�����", 4)
	};*/
	Tire[] tire;
	
	Car(){
		tire =  new Tire[]{
				new Tire("�տ���", 6),
				new Tire("�տ�����", 2),
				new Tire("�ڿ���", 3),
				new Tire("�ڿ�����", 4)	
		};
	}
	
	
	
	int run(){
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		for(int i=0;i<5;i++){
			if(tire[i].roll() == false){
				stop();
				return(i+1);
			}
		}
		return 0;
	}
	
	void stop(){
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
