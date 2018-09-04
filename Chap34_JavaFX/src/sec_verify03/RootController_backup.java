package sec_verify03;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RootController_backup {
	
	@FXML private TextField txtfld;
	private Double x1= null;
	private Double x2= null;
	private Double buffer =null;
	private String operator=null;
	private boolean x1Done =false;
	private boolean resetReady=false;
	
	public Button getButton(ActionEvent event) {
		Button b=(Button)event.getSource();
		return b;
	}
	
	public void buttonController(ActionEvent event) {
		if(resetReady)	//계산결과를 출력 후 연산 기호(+-/*)를 누르지않고 
			resetAll();	//바로 숫자를 클릭할 시 값 초기화
		buildInput(event);
	}
	
	public void buildInput(ActionEvent event) {
		Button b=getButton(event);
		txtfld.appendText(b.getText());
		if(!x1Done)	//연산기호를 입력하기 전까지의 값을 x1에 입력 
			x1=Double.parseDouble(txtfld.getText());
		else {		//연산기호 입력 후의 값을 x2에 입력.
			x2=Double.parseDouble(txtfld.getText());
			buffer=x2;
		}
	}
	
	public void functionController(ActionEvent event) {
		functionClicked(event);
		operator=getButton(event).getText();	//연산기호 지정.
		
	}
	
	public void functionClicked(ActionEvent event) {
		x1Done =true;				//연산기호가 한 번 클릭된 후의 값들은 x2에 배정하기 위함.
		if(x1!=null&&x2!=null) {
			enterPressed(event);	//x1,x2둘다 값이 지정되어 있을 경우 자체적으로 enter를 눌러준다. 
		}							
		txtfld.clear();				
		resetReady=false;			//연산 기호를 한번이라도 눌렀다면, 계속해서 계산을 하는 것으로 가정,
	}								//초기화 되는 것을 방지하기 위해 false로 지정.
		
	public void enterPressed(ActionEvent event) {
		try {
			x1 = calculation(x1,buffer);
			txtfld.setText(format(x1));	//x1을 업데이트하고, 다음 값 저장을 위해 x2를 비워둔다.
			x2=null;		//x2값은 버퍼에 저장하여 기존의 값을 기억하도록 한다. 
			resetReady=true;
		}catch(NullPointerException e) {}
	}
	
	public String format(Double a) {
		String retStr;
		NumberFormat nf=NumberFormat.getInstance();
		BigDecimal num = new BigDecimal(a);
		int length = String.valueOf(num).length();
		System.out.println(length);

		retStr = String.valueOf(nf.format(num));
		if(length<=16) {
			nf=NumberFormat.getInstance();
			retStr = nf.format(num);
		}else
			retStr = String.valueOf(nf.format(num));
		
		return retStr;
	}
	public void resetAll() {
		txtfld.clear();
		x1=null;
		x2=null;
		buffer = null;
		operator=null;
		x1Done =false;
		resetReady=false;
	}
	
	public double calculation(Double x1, Double x2) {
		switch(operator) {
		case "+" :
			x1+=x2;
			break;
		case "-" :
			x1-=x2;
			break;
		case "*" :
			x1*=x2;
			break;
		case "/" :
			x1/=x2;
			break;
		}
		return x1;
	}
}
