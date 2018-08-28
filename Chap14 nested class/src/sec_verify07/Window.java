package sec_verify07;

public class Window {
	Button btn1;
	Button btn2;
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("Button1 누름 : 전화를 겁니다.");
		}
	};
	
	public Window() {
		btn1 = new Button();
		btn2 = new Button();
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Button2 누름 : 메세지를 보냅니다.");
			}
		});
	}
}


