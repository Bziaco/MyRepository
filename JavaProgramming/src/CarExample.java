import java.util.Scanner;

public class CarExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int count=1;
		
		for(int i=0;i<(input/2)+1;i++){
			for(int j=0;j<(input/2)-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<count+i;j++){
				System.out.print("*");

			}
			for(int j=count+i;j<(input/2)+i;j++){
				System.out.print(" ");
			}
			System.out.println();
			count++;
		}
		for(int i=(input/2)+1;i<input;i++){
	
			for(int j=0;j<i-(input/2);j++){
				System.out.print(" ");
			}
			for(int j=0;j<(count);j++){
				System.out.print("*");
			}
			for(int j=(count+1);j<(input/2)+i;j++){
				System.out.print(" ");
			}

			System.out.println();
			count--;
		}
	}
}
