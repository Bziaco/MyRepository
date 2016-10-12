import java.util.Scanner;

public class test {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      String str = sc.nextLine();
	      String find = sc.nextLine();
	      int count =0;
	      
	      for(int i=0;i<str.length()-3;i++){
	         if(find.charAt(i)== str.charAt(i)){
	            if(find.charAt(i+1)==str.charAt(i+1)){
	               if(find.charAt(i+2)==str.charAt(i+2)){
	                  if(find.charAt(i+3)==str.charAt(i+3)){
	                     System.out.println(i);
	                  }
	               }
	            }
	         }
	      }
	}
}
