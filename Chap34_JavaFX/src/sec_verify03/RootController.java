package sec_verify03;

import java.math.BigDecimal;
import java.text.NumberFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RootController {
	/*
	 * 확인 list
	 *엔터 후(연산 후) 바로 숫자누를때 초기화
	 *엔터 누르고 그 값을 바로 연산할 수 있는지
	 *연속적인 연산
	 *1+5+4-6등 operator를 여러개 연속해서 입력해볼것
	 *+했다가 *하면 *를 저장할 것
	 *0을 입력하지않고 .을 찍을 경우
	 */
	@FXML private TextField txtfld;
	private BigDecimal x1= null;
	private BigDecimal x2= null;
	private BigDecimal buffer =null;
	private String operator=null;
	private boolean x1Done =false;
	private boolean resetReady=false;
	
	private Button getButton(ActionEvent event) {
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
		try {
			if(!x1Done)	//연산기호를 입력하기 전까지의 값을 x1에 입력 
				x1=new BigDecimal(txtfld.getText());
			else {		//연산기호 입력 후의 값을 x2에 입력.
				x2=new BigDecimal(txtfld.getText());
				buffer=x2;
			}
		}catch(NumberFormatException e) { //소수 입력시 0을 입력하지 않고 .부터 찍을 경우 입력되지 않음.
			txtfld.clear();
		}
	}
	
	public void functionController(ActionEvent event) {
		functionClicked(event);
		operator=getButton(event).getText();	//연산기호 지정.
	}
	
	//연산기호가 클릭된 것을 숫자 입력이 끝난 것으로 가정.
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
			x2=null;					//x2값은 버퍼에 저장하여 기존의 값을 기억하도록 한다. 
			resetReady=true;
		}catch(NullPointerException e) {}
	}
	
	public String format(BigDecimal num) {
		String retStr;
		NumberFormat nf=NumberFormat.getInstance();
		if(num.doubleValue()>=1)
			retStr = String.valueOf(nf.format(num));
		else {
			retStr=String.valueOf(num);
		}
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
	
	public BigDecimal calculation(BigDecimal x1, BigDecimal x2) {
		switch(operator) {
		case "+" :
			x1=x1.add(x2);
			break;
		case "-" :
			x1=x1.subtract(x2);
			break;
		case "*" :
			x1=x1.multiply(x2);
			break;
		case "/" :
			x1=x1.divide(x2);
			break;
		}
		return x1;
	}
}
