package ch05.exam03;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
		System.out.println("--------------------------------------------");
		
		System.out.print("����> ");
	
		int keycheck = scanner.nextInt();
		
		while(true){
			switch(keycheck){
				case 1:
					System.out.print("�л���> ");
					String studentNum = scanner.nextLine();
					
				case 2:
					
					
				case 3:
					
					
				case 4:
					
					
				case 5:

			}
		}
		
	}
	
}
