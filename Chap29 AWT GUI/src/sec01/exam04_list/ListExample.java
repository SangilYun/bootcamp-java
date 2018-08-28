package sec01.exam04_list;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Toolkit;

public class ListExample {

	public static void main(String[] args) {
		
		Frame f = new Frame("List 예");
		f.setSize(300,200);
		f.setLayout(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();//구현된 Toolkit객체를 얻는다.
		Dimension screenSize = tk.getScreenSize();//화면의 크기를 구한다.
		
		f.setLocation((screenSize.width/2)-150, (screenSize.height/2)-100);
		f.setVisible(true);
		
		//목록을 보여줄 수 있는 List를 만든다. 여기서는 한가지만 선택할 수 있다.
		//기본적으로 생성자에서는 두번째 매개값은 false로 되어 있다.
		List selectOne = new List();
		selectOne.setLocation(20, 40);
		selectOne.setSize(100, 120);
		selectOne.add("학생");
		selectOne.add("선생");
		selectOne.add("운전기사");
		selectOne.add("프로그래머");
		selectOne.add("노가다");
		selectOne.add("가수");
		selectOne.add("대통령");
		selectOne.add("교수");
		selectOne.add("파지수집");
		

		//생성자의 두번째 인자값을 true로 설정해서 List의 목록에서 여러 개를 선택할 수 있다.
		
		List selectMany = new List(100,true);
		selectMany.setLocation(150,40);
		selectMany.setSize(100,120);
		selectMany.add("1광");
		selectMany.add("3광");
		selectMany.add("광");
		selectMany.add("8광");
		selectMany.add("로얄이스탐불");
		selectMany.add("스트레이트 후레쉬");
		//Frame에 컴포넌트들을 붙인다.
		f.add(selectOne);
		f.add(selectMany);
	}

}
