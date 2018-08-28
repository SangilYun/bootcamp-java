package sec_verify04;

public class ListExample {

	public static void main(String[] args) {

		Board b1 = new Board("이것이 자바다","신용권");
		Board b2 = new Board("자바의정석","남궁성");
		Board b3 = new Board("명품 자바 프로그래밍","황기태");
		
		BoardDao bd = new BoardDao();
		bd.addBoard(b1);
		bd.addBoard(b2);
		bd.addBoard(b3);
		
		bd.getBoardList();
	}

}
