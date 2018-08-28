package sec03_exam_singleinheritance;

public class Deck {

	final int CARD_NUM = 52;
	
	//객체배열(2차원 배열타입) 
	Card[] c = new Card[CARD_NUM];
	
	//기본 생성자
	public Deck() {
		int i = 0;
		//52번을 돌면서 카드를 c[]에 초기화 해둠.
		for(int k = Card.KIND_MAX; k>0; k--) {
			for(int n = 1 ; n<Card.NUM_MAX +1 ; n++) {
				c[i++] = new Card(k,n);
			}
		}
		
		for(int j=0; j<c.length; j++) {
			System.out.printf("C[%d]의 무늬  : %d, C[%d]의 숫자 : %d", j , c[j].kind , j, c[j].number);
			System.out.println();
		}
	}
	
	//지정된 위치(index)에 있는 카드 하나를 선택한다.
	public Card pick(int index) {
		if(0<=index && index < CARD_NUM)
			return c[index];
		else
			return pick();
	}
	
	//Deck에서 카드 하나를 선택한다.
	public Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		System.out.println("index : " + index);
		System.out.print("임의로 뽑은 카드 : ");
		System.out.printf("%d", index);
		return pick(index);
	}
	
	public void shuffle() {
		//카드의 순서를 섞는다.
		for(int n=0; n<1000; n++) {
			int i= (int)(Math.random() * CARD_NUM);
			//조건문이 없기때문에 그냥 막 섞는다.
			Card temp = c[0];
			c[0] = c[i];
			c[i] = temp;
		}
		
		System.out.println();
		System.out.println("카드 섞은 후 결과 입니다.");
		//카드 섞은 후 출력해봄
		for(int j = 0 ;j<c.length;j++) {
			System.out.printf("C[%d]의 무늬 : %d, C[%d]의 숫자 : %d"
					, j, c[j].kind, j, c[j].number);
			System.out.println();
		}
	}
}
