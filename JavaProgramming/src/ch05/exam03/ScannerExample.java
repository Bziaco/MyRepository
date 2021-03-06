package ch05.exam03;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생수: ");
		String strNum = scanner.nextLine();
		int num = Integer.parseInt(strNum);
		int[] scores = new int[num];
		
		for(int i=0;i<scores.length;i++){
			System.out.print("점수: ");
			String data = scanner.nextLine();
			
			int score = Integer.parseInt(data);
			scores[i] = score;
		}
		
		int sum = 0;
		
		for(int score : scores){
			sum += score;
		}
		System.out.println("전체 합: " + sum);
		
		
		double avg = (double)sum/scores.length;
		System.out.println("평균: " + avg);

	}

}
