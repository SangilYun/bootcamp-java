package sec01.exam08_TextArea;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaExample {

	public static void main(String[] args) {
		 Frame f = new Frame("Comments");
		 f.setSize(400,200);
		 f.setLayout(new FlowLayout());
		 
		 //text - TextArea에 보여질 text를 지정한다.
		 //row - TextArea의 줄(row)수를 지정한다.
		 //col - TextArea의 열(column)수를 적는다.
		 // TextArea comments = new TextArea("하고싶은 말을 적으세요.", 10,50, TextArea.SCROLLBARS_BOTH);
		 TextArea comments = new TextArea("하고 싶은 말을 적으세요.", 10,50, TextArea.SCROLLBARS_BOTH);
		 
		 f.add(comments);
		 //TextArea의 text전체가 선택 되도록 한다. 그럼 유저가 바로 타이핑을 시작하면 초기에 입력되있는 값 위에
		 //입력이 되기때문에 지우고 새로쓸 필요가 없다. 유저의 편의를 위한 것.
		 comments.selectAll();
		 f.setVisible(true);

	}

}
