package ch08.service;

import ch08.dao.BoardDao;
import ch08.dto.Board;

public class Exam05 {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		Board board = new Board();
		board.setBno(4);
		board.setBwriter("임창정");
		
		dao.update(board);
	}
}
