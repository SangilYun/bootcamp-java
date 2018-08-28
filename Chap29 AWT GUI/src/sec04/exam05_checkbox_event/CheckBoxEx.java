package sec04.exam05_checkbox_event;

import java.awt.*;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxEx extends Frame{

	CheckboxGroup group;
	Checkbox cb1;
	Checkbox cb2;
	Checkbox cb3;
	

	public CheckBoxEx(String s) {
		super(s);
		this.group = new CheckboxGroup();
		
		//아래 3개의 CheckBox는 CheckBoxGroup에 속해 있으며, 하나밖에 선택을 하지 못한다.
		//또한 매개값 중 세번째의 true는 실행시 미리 체크를 하라고 한 것이다. 
		this.cb1 = new Checkbox("red",group, true);
		this.cb2 = new Checkbox("green",group, false);
		this.cb3 = new Checkbox("blue",group, false);
		
		//CheckBox의 배경색을 CYAN으로 지정하였다.
		this.cb1.setBackground(Color.CYAN);
		this.cb2.setBackground(Color.CYAN);
		this.cb3.setBackground(Color.CYAN);
		
		//CheckBox에 ItemListener를 붙이고 있다.
		this.cb1.addItemListener(new EventHandler());
		this.cb2.addItemListener(new EventHandler());
		this.cb3.addItemListener(new EventHandler());
		
		this.setLayout(new FlowLayout());
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		this.setBackground(Color.red); //시작 시 프레임색깔을 red로 설정함.
		this.setLocation(500, 300);
		this.setSize(500, 300);
		this.setVisible(true);
		
		WindowAdapter wa = new WindowAdapter() {
			@Override 
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(wa);
	}
	//중첩클래스인 ItemListener를 구현한 클래스
	class EventHandler implements ItemListener{
		//CheckBox의 CheckBox(Radio)버튼을 클릭하면 itemStateChange()가 호출된다.
		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println("ItemEvent발생");
			//getSource()는 모든 이벤트클래스에서 사용할 수 있다.
			//리턴타입이 Object라서 타입변환을 하고 있다.
			Checkbox cb = (Checkbox)e.getSource();
			//CheckBox의 Label값을 얻어서 아래와 같이 비교를 하고 있다.
			String color = cb.getLabel();
			if(color.equals("red")) {
				//외부 클래스 접근하여 배경색을 바꾸고 있다.
				CheckBoxEx.this.setBackground(Color.red);
			}
			else if(color.equals("green")) {
				CheckBoxEx.this.setBackground(Color.green);
			}
			else {
				CheckBoxEx.this.setBackground(Color.blue);
			}
		}
	}
}
