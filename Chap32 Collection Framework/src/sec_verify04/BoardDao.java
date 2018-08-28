package sec_verify04;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> list;
	
	public BoardDao() {
		list = new ArrayList<>();
	}
	public void addBoard(Board b) {
		list.add(b);
	}
	public void getBoardList(){
		System.out.println("현재 list에 저장되어 있는 Board객체들입니다.");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getTitle() + " : "+list.get(i).getContent());
		}
	};
}
