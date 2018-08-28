package sec_verify01;

public class ThreadExample {

	public static void main(String[] args) {
		 
		Thread t1 = new MovieThread();
		Thread t2 = new Thread(new RecordingRunnable());

		//start는 한번밖에 실행못하기 때문에 main에서 start를 for문 안에 돌릴 수 없다. 
		t1.start();
		t2.start();
		//-------------------------------------------------------
		//익명자식객체를 이용.
		Thread a1= new Thread() {
			@Override
			public void run() {
				Thread movie = new Thread() {
					@Override
					public void run() {
						for(int i=0; i<3; i++) {
							System.out.println("동영상을 재생합니다.");
						}
					}	
				};
				
				Thread record = new Thread() {
				@Override
					public void run() {
						for(int i=0; i<3; i++) {
							System.out.println("녹화를 진행합니다.");
						}
					}	
				};
				movie.start();
				record.start();
			}
		};
		//-------------------------------------------------------
		System.out.println();
		a1.start();
	}
}
