package sec_verify10;

public class SoundableExample {

	public static void main(String[] args) {
		
		Soundable soundable = new Soundable() {
			int i = 1;
			public void method() {
				if(i==1)
					System.out.print("첫번째 익명구현객체 : ");
				else
					System.out.print("두번째 익명구현객체 : ");
			}
			@Override
			public
			void sound() {
				if(i == 1) {
					this.method();
					System.out.println("냄비");
					System.out.println("냄비에 물을 담습니다.");
				}
				else {
					this.method();
					System.out.println("가스렌지");
					System.out.println("가스렌지에 가스를 켭니다.");
				}
				i++;
			}
		};

		soundable.sound();
		soundable.sound();
	}

}
