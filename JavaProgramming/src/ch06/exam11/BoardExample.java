package ch06.exam11;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Board[] boarders = new Board[30];;
		String boarderNum = null;
		String title = null;
		String text = null;
		String author = null;
		int count = 0;
		int modify = 0;
		int select = 0;

		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.��� | 2.�۾��� | 3.�󼼺��� | 4.�����ϱ� | 5.�����ϱ� | 6.����");
			System.out.println("----------------------------------------------------");

			System.out.print("����> ");
			String choiceNum = scanner.nextLine();
			
			
			
			if (choiceNum.equals("1")) {
	
				System.out.println("------------------------------------------------------");
				System.out.println("�Խù� ��ȣ\t\t�Խù� ����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------");

				for (Board boarder : boarders) {
					if (boarder != null) {
						System.out.println(boarder.boarderNum + "\t\t" + boarder.titile + "\t\t" + boarder.author + "\t\t" + boarder.count);
					}
				}
			} else if (choiceNum.equals("2")) { // �۾���

				System.out.print("�۾���: ");
				author = scanner.nextLine();
				System.out.print("����: ");
				title = scanner.nextLine();
				System.out.print("����: ");
				text = scanner.nextLine();

				for (int i = 0; i < boarders.length; i++) {

					if (boarders[i] == null) {
						boarderNum = String.valueOf(i);
						boarders[i] = new Board(boarderNum, title, author, count);
						break;
					}
				}
			} else if (choiceNum.equals("3")) { // �󼼺���

				System.out.println("-----");
				System.out.println("��ȣ\t\t����\t\t��ȸ��");
				System.out.println("-----");

				for (int i=0;i<boarders.length;i++) { // ������
					if (boarders[i] != null) {
						System.out.println(boarders[i].boarderNum + "\t\t" + boarders[i].titile + "\t\t" + boarders[i].count);
					}
				}
				if (boarderNum != null) {
					System.out.print("����> ");
					// String[] boarder = {boarderNum, title, text,
					// String.valueOf(count)};
					select = Integer.parseInt(scanner.nextLine());
						if (boarders[select] != null) {
							System.out.println(boarders[select].text);
							// System.out.println(boarder[2]);

							// count = Integer.parseInt(boarder[3]);

							count = boarders[select].count;
							count++;
							boarders[select].count = count;
					}
				} else
					System.out.println("����� �����ϴ�.");
			} else if (choiceNum.equals("4")) { // ����
				if (boarderNum != null) {
					System.out.print("������ ��ȣ> ");
					modify = Integer.parseInt(scanner.nextLine());
					if (boarders[modify] != null) {
						// boarders[modify] = null;
						System.out.print("������ ����> ");
						title = scanner.nextLine();
						System.out.print("������ ����> ");
						text = scanner.nextLine();
						// String[] boarder= {boarderNum, title, text, author,
						// String.valueOf(count)};
						boarders[modify].titile = title;
						boarders[modify].text = text;
					}
				} else
					System.out.println("����� �����ϴ�.");
			} else if (choiceNum.equals("5")) { // ����
				if (boarderNum != null) {
					System.out.print("������ ��ȣ> ");
					int sno = Integer.parseInt(scanner.nextLine());
					if (boarders[sno] != null) {
						boarders[sno] = null;
					}
				} else
					System.out.println("����� �����ϴ�.");
			} else if (choiceNum.equals("6")) {
				break;
			}
		}

	}

}
