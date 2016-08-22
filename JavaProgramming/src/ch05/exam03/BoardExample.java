package ch05.exam03;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] boarders = new String[100][];
		String boarderNum = null;
		String title = null;
		String text = null;
		String author = null;
		int count = 0;

		
		
		while(true){
			System.out.println("----------------------------------------------------");
			System.out.println("1.��� | 2.�۾��� | 3.�󼼺��� | 4.�����ϱ� | 5.�����ϱ� | 6.����");
			System.out.println("----------------------------------------------------");
			
			System.out.print("����> ");
			String choiceNum = scanner.nextLine();
			
			
			if(choiceNum.equals("1")){

					System.out.println("------------------------------------------------------");
					System.out.println("�Խù� ��ȣ\t\t�Խù� ����\t\t�۾���\t\t��ȸ��");
					System.out.println("------------------------------------------------------");
					
					for(String[] boarder : boarders){
						if(boarder != null){ 
							System.out.println(boarder[0] + "\t\t" +boarder[1] + "\t\t" + boarder[3] + "\t\t" + boarder[4]); 
						}
					//}
				}
			} else if(choiceNum.equals("2")){  //�۾���
				System.out.print("�۾���: ");
				author = scanner.nextLine();
				System.out.print("����: ");
				title = scanner.nextLine();
				System.out.print("����: ");
				text = scanner.nextLine();
				
				for(int i=0;i<boarders.length;i++){
					if(boarders[i] == null){
						boarderNum = String.valueOf(i);
						String[] boarder= {boarderNum, title, text, author, String.valueOf(count)};
						boarders[i] = boarder;
						break; 
					}
				}
			} else if(choiceNum.equals("3")){      //�󼼺���

				System.out.println("-----");
				System.out.println("��ȣ\t\t����\t\t��ȸ��");
				System.out.println("-----");

					for(String[] boarder : boarders){  //������
						if(boarder != null){ 
							System.out.println(boarder[0] + "\t\t"+boarder[1] + "\t\t" + boarder[4]);
						}
					}
				if(boarders != null){
				System.out.print("����> ");
				//String[] boarder = {boarderNum, title, text, String.valueOf(count)};

				int select = Integer.parseInt(scanner.nextLine());

				System.out.println(boarders[select][2]);
				//System.out.println(boarder[2]);
				
				//count = Integer.parseInt(boarder[3]);
				
				count = Integer.parseInt(boarders[select][4]);
				count++;
				boarders[select][4] = String.valueOf(count);
				}

				
			} else if(choiceNum.equals("4")){      //����
				if(boarderNum != null){
					System.out.print("������ ��ȣ> ");
					int modify = Integer.parseInt(scanner.nextLine());
					boarders[modify] = null;
					System.out.println("������ ����");
					title = scanner.nextLine();
					System.out.println("������ ����");
					text = scanner.nextLine();
					
					String[] boarder= {boarderNum, title, text, author, String.valueOf(count)};
					boarders[modify] = boarder;
				}else
					System.out.println("����� �����ϴ�.");
			} else if(choiceNum.equals("5")){    //����
				if(boarders != null){
					System.out.print("������ ��ȣ> ");
					int sno = Integer.parseInt(scanner.nextLine());
					boarders[sno] = null;
				}
			} else if(choiceNum.equals("6")){
				break;
			}
		}

	}

}
