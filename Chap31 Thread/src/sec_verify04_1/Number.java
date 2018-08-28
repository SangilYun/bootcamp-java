package sec_verify04_1;

public class Number {
	int sum;
	String name;
	public Number(String s){
		this.name = s;
	}

	public synchronized void addNum() {
			System.out.println(Thread.currentThread().getName()+"실행 중 ");
			sum =0;
			
			for(int i=0; i<100000; i++) {
				sum+=i;
			}
			System.out.println("0~100000까지의 합을 구합니다. " + sum);

	}
	
	public String getName() {
		return this.name;
	}
	
	public void changeName(String name) {
		
		this.name = name;
	}
}
