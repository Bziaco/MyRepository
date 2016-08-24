package ch06.exam11;

import java.util.Scanner;

public class ScoreManagement {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		//String[][] students = null;
		Student[] students = null;
		
		
		
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
				int totalNum = Integer.parseInt(scanner.nextLine());
				students = new Student[totalNum];
				
			}else if(choiceNum.equals("2")){
				System.out.println("-----------------------------------------");
				System.out.println("�й�\t\t�̸�\t\t����");
				System.out.println("-----------------------------------------");
				//if(students != null){
					for(int i=0;i<students.length;i++){
						if(students != null){ //��ϰ��� ���� �ʾ����Ƿ� �迭���� null�� �� �ִ�. �׷��� null�� �ƴ� ���� �����ϵ��� �Ѵ�.
							Student student = students[i];
							System.out.println(student.no + "\t\t" + student.name + "\t\t" + student.score); //�Է��� ���� �ʰ� ����� ������� ��� nullpointException ���
						}
					//}
				}
			}else if(choiceNum.equals("3")){
					//System.out.println("�й�: " + studentNum);
					System.out.print("�л��̸�: ");
					String name = scanner.nextLine();
					System.out.print("�л�����: ");
					int score = Integer.parseInt(scanner.nextLine());
					for(int i=0;i<students.length;i++){
						if(students[i] == null){
							Student student = new Student(i, name, score);
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
				//for(Student student : students){
				for(int i=0;i<students.length;i++){
					if(students != null){
						if(max < students[i].score){
								max = students[i].score;
						}
					}
				}
				System.out.println("-----------------------------------------");
				System.out.println("�й�\t\t�̸�\t\t����");
				System.out.println("-----------------------------------------");
				for(Student student : students){
					if(student != null){ 
						if(max == student.score){
							System.out.println(student.no +", " + student.name + ", " + student.score);
						}
					}
				}
			}else if(choiceNum.equals("6")){
				int count =0;
				int sum =0;
				double avg =0;
				for(Student student : students){
					if(student != null){
						count++;
						sum += student.score;
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

