package ch05.exam03;

import java.util.Scanner;

public class ScoreManagementFinal {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String[][] students = null;
		
		
		
		while (true) {
			System.out.println("------------------------------------------------------------");
			if(students == null){
				System.out.println("1.�� �л��� | 7.����");
			} else{
				System.out.println("1.�� �л��� | 2.��� | 3.�Է� | 4.���� | 5.�ְ����� | 6.������� | 7.����");
			}
			System.out.println("------------------------------------------------------------");
			System.out.print("����> ");
			String choiceNum = scanner.nextLine();
			
			if(choiceNum.equals("1")){
				System.out.print("�� �л���> ");
				String totalNum = scanner.nextLine();
				int num = Integer.parseInt(totalNum);
				students = new String[num][];
				
			}else if(choiceNum.equals("2")){
				System.out.println("-----------------------------------------");
				System.out.println("�й�\t\t�̸�\t\t����");
				System.out.println("-----------------------------------------");
				//if(students != null){
					for(String[] student : students){
						if(student != null){ //��ϰ��� ���� �ʾ����Ƿ� �迭���� null�� �� �ִ�. �׷��� null�� �ƴ� ���� �����ϵ��� �Ѵ�.
							System.out.println(student[0] + "\t\t" + student[1] + "\t\t" + student[2]); //�Է��� ���� �ʰ� ����� ������� ��� nullpointException ���
						}
					//}
				}
			}else if(choiceNum.equals("3")){
					//System.out.println("�й�: " + studentNum);
					System.out.print("�л��̸�: ");
					String name = scanner.nextLine();
					System.out.print("�л�����: ");
					String score = scanner.nextLine();
					
					for(int i=0;i<students.length;i++){
						if(students[i] == null){
							String studentNum = String.valueOf(i); //�������� ���ڿ��� �ٲٴ� ��
							String[] student = {studentNum, name, score};
							students[i] = student;
							break; //null�� ã�����ϱ� break�� ���� ���´�.
						}
					}
			}else if(choiceNum.equals("4")){
				System.out.print("������ �й�> ");
				int sno = Integer.parseInt(scanner.nextLine());
				students[sno] = null;
				if(students[sno] == null)
					System.out.println("���������� �����߽��ϴ�.");
			}else if(choiceNum.equals("5")){
				int max=0;
				for(String[] student : students){
					if(student != null){ 
						if(max < Integer.parseInt(student[2])){
								max = Integer.parseInt(student[2]);
						}
					}
				}
				System.out.println("-----------------------------------------");
				System.out.println("�й�\t\t�̸�\t\t����");
				System.out.println("-----------------------------------------");
				for(String[] student : students){
					if(student != null){ 
						if(max == Integer.parseInt(student[2])){
							System.out.println(student[0] +", " + student[1] + ", " + student[2]);
						}
					}
				}
			}else if(choiceNum.equals("6")){
				int count =0;
				int sum =0;
				double avg =0;
				for(String[] student : students){
					if(student != null){
						count++;
						sum += Integer.parseInt(student[2]);
					}
					
				}
				avg = (double)sum/count;
				System.out.println("����: " + avg);
			}else if(choiceNum.equals("7")){
				break;
			}
			
		}
	}
}

