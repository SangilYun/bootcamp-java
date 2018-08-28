package sec17.exam03_thread_pool_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		 //해당 PC CPU의 코어수를 최대 스레드 수로 준다. (ex.듀얼코어는 2, 쿼드코어는 4이다.)
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		System.out.println("스레드 개수 : " + Runtime.getRuntime().availableProcessors());
		
		//Callable 익명 구현객체 생성(작업객체) -->
		//리턴값이 <T>타입으로 존재한다. 하여, 리턴값이 <T>타입과 동일해야 한다. 
		System.out.println("[작업처리 요청]");

		Callable<Integer> callable = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int sum =0;
				for(int i=1; i<=10; i++)
					sum += i;
				
				return sum;
			}
		};
		//작업 큐에 작업을 넣는다.
		//리턴값이 <T>. 하여 Future<T> submit(Callable task)를 선택한다. 
		//작업이 완료될 때까지 블로킹 즉 기다린다. Future는 지연완료 객체이다. 
		//Future역시 <T>타입으로 설정해야 한다. 
		Future<Integer> future = executorService.submit(callable);
		
		try {
			
			System.out.println("블로킹 시작"+System.nanoTime());
			int value = future.get();	//get()은 작업객체가 작업을 완료할 때까지 기다린다.(블로킹)
			System.out.println("블로킹 끝"+System.nanoTime());
			System.out.println();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		executorService.shutdown(); //스레드풀 종료
	}

}
