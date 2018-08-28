package sec_verify02;

public class ThreadExample {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		Thread yt = new Thread(new YourThreadRunnable());
		
		mt.start();
		yt.start();
		
		//익명 객체로 
		Thread t = new Thread() {
			@Override
			public void run() {
				Thread my = new Thread() {
					@Override
					public void run() {
						for(int i=0; i<5; i++) {
							try {
								System.out.println("My");
								sleep(80);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				};
				
				Thread your = new Thread() {
					@Override
					public void run() {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						for(int i=0; i<5; i++) {
							System.out.println("Your");
						}
					}
				};
				my.start();
				your.start();
			}
		};
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		t.start();
	}
}
