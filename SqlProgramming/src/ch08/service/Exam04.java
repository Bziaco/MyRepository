package ch08.service;

import ch08.dao.BoardDao;
import ch08.dto.Board;

public class Exam04 {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		Board board = new Board();
		board.setBno(1);
		board.setBtitle("내가 저지른 사랑");
		board.setBcontent("오랜만이야");
		board.setBwriter("임창정");
		
		dao.insert(board);
	}
}
