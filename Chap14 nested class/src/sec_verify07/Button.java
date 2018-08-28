package sec_verify07;

public class Button {
	interface OnClickListener{
		void onClick();
	}
	
	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener ol) {
		this.listener = ol;
	}
	
	void touch() {
		listener.onClick();
	}
	
	

}
