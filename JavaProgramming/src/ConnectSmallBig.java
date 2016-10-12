
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConnectSmallBig {
   public static void main(String[] args) {
	   ArrayList<Integer> numberList = new ArrayList<Integer>()	;
	   ArrayList<String> numList = new ArrayList<String>();
      
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String input = br.readLine();
         String[] numStrList = input.split(" ");
         for(String number : numStrList){
        	 numberList.add(Integer.parseInt(number));
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      for(int i=0;i<numberList.size();i++){
    	  numList.add(numberList.get(i)).charAt(i);
    	  System.out.println(numList.get(i));
      }
      
      
   }
}
