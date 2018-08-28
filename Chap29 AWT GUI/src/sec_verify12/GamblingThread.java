package sec_verify12;

import java.awt.Label;

public class GamblingThread implements Runnable{
   
	Label l;
	Label[] ls;
    int index =0;
    
    static final int delay=300;
    Thread t;
    
    public GamblingThread(Label[] l, Label s) {
    	this.l =s;
    	this.ls = l;
    	t= new Thread(this);
    	t.start();
    }
    //run 메서드 구현
    public void run() {
    	for(int i=0;i<ls.length;i++) {
	    	int ranNum=(int)(Math.random()*5);
	    	try {
	    		 Thread.sleep(delay);	//3개의 수를 300ms간격으로 하나씩 출력
	    		 ls[i].setText(Integer.toString(ranNum));
	    		}
			catch (InterruptedException e) {
			     System.out.println("something's wrong");
			}
    	}
    	
    	//숫자를 체크해서 알맞는 텍스트 출력
    	if((ls[0].getText()).equals(ls[1].getText())
    			&& (ls[1].getText()).equals(ls[2].getText()) ) {
    		l.setText("축하합니다.");
    	}
    	else {
    		l.setText("아쉽군요");
    	}
    }
}

