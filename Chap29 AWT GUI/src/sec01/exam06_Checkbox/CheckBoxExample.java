package sec01.exam06_Checkbox;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckBoxExample {

	public static void main(String[] args) {
		 
		Frame f = new Frame("체크박스 예제");
		f.setSize(305,250);
		
		//Frame의 LayoutManger를 FlowLayout으로 설정한다.
		//FlowLayout방식은 배치의 한 방식으로 좌측에서 우측으로 컴포넌트를 정렬시킨다. 
		//지금은 왼쪽정렬을 선택했다.
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//Checkbox를 개별적으로 생성하면, 다중 선택이 되어진다.
		Label q1 = new Label("1.당신의 관심 분야는?(여러 개 선택가능)");
		//true는 선택된 상태로 생성
		Checkbox news = new Checkbox("news",true);
		Checkbox sports = new Checkbox("sports");
		Checkbox movies = new Checkbox("movies");
		Checkbox music = new Checkbox("music");
		f.add(q1); f.add(news); f.add(sports); f.add(movies); f.add(music);
		
		//체크박스 그룹을 설정하면, 기본적으로 1개 밖에 선택을 못하게 된다.
		Label q2 = new Label("2.얼마나 자주 극장에 가십니까?");
		CheckboxGroup group1 = new CheckboxGroup();
		
		//Checkbox를 생성하여 소속을 group1으로 만든다. true는 default 값을 의미한다.
		Checkbox movie1 = new Checkbox("한달에 한 번 갑니다.",group1, true);
		Checkbox movie2 = new Checkbox("일주일에 한 번 갑니다.",group1, false);
		Checkbox movie3 = new Checkbox("일주일에 두 번 갑니다.",group1, false);
		
		f.add(q2); f.add(movie1); f.add(movie2); f.add(movie3);
		
		Label q3 = new Label("3.하루에 얼마나 컴퓨터를 사용하십니까?");
		CheckboxGroup group2 = new CheckboxGroup();
		
		//Checkbox를 생성하여 소속을 group2로 만든다. true는 기 선택된 값을 의미한다.
		Checkbox com1 = new Checkbox("5시간 이하", group2, true);
		Checkbox com2 = new Checkbox("10시간 이하", group2, false);
		Checkbox com3 = new Checkbox("15시간 이상", group2, false);

		f.add(q3); f.add(com1); f.add(com2); f.add(com3);
		f.setVisible(true);
	}

}
