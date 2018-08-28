package sec_verify11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolCallableExample {

	public static ExecutorService createThreadPool() {
		return Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}	
	
	public static void main(String[] args) {
		 ExecutorService e = createThreadPool();
		 Future<Integer> f = e.submit(new SumThread());
		 try {
			System.out.println(f.get());
		} catch (InterruptedException | ExecutionException e1) {
			e1.printStackTrace();
		}
		 e.shutdown();
	}
}
