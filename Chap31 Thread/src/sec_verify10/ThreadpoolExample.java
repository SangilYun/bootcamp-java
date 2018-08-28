package sec_verify10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadpoolExample {

	static ExecutorService createThreadPool() {
		return Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}

	public static void main(String[] args) {
		ExecutorService es = createThreadPool();
		es.submit(new GugudanThread());
//		Future<?> f = es.submit(new GugudanThread());
//		
//		try {
//			f.get();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		es.shutdown();
	}

}
