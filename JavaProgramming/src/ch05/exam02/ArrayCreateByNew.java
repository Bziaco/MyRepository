package ch05.exam02;

public class ArrayCreateByNew {
	public static void main(String[] args) {
		//�⺻Ÿ�� �迭
		int[] array1 = new int[3];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		for(int i=0;i<array1.length;i++){
			System.out.println("array1[" + i + "] = " + array1[i]);
		}
		
		
		
		//����Ÿ�� �迭
		String[] array2 = new String[3];
		array2[0] = "�ڹ�";
		array2[1] = "ȫ�浿";
		array2[2] = "���ѹα�";
		for(int i=0;i<array2.length;i++){
			System.out.println("array2[" + i + "] = " + array2[i]);
		}
		
	}
}
