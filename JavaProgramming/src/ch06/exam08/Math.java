package ch06.exam08;

public class Math {
	//Field
	
	//Constructor
	
	//Method
	void printInfo(String info)	{
		System.out.println(info);
	}
	
	int max(int x, int y){
		if(x>y){
			return x;
		}
		else{
			return y;
		}
	}
		
	double avg1(int[] values){
			int sum =0;
			for (int i = 0; i < values.length; i++) {
				sum += values[i];
			}
			double avg = (double)sum / values.length;
			return avg;	
	}
			
			
	double avg2(int ... values){
			int sum =0;
			for (int j = 0; j < values.length; j++) {
				sum += values[j];
			}
			double avg = (double)sum / values.length;
			return avg;	
			}
		}
