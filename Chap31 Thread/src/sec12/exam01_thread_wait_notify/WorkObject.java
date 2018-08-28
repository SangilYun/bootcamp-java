package sec12.exam01_thread_wait_notify;

public class WorkObject {

   
   public synchronized void methodA() {
      System.out.println("ThreadA의 methodA()실행");
      notify();
      
      try {
         //자기 자신은 일시정지 상태가 된다.
         //(스스로 실행대기 상태로 못감)
         wait();
      } catch(InterruptedException e) {}
   }
   
   public synchronized void methodB() {
      System.out.println("ThreadB의 methodB()실행");
      notify();
      
      try {
         //자기 자신은 일시정지 상태가 된다.
         //(스스로 실행대기 상태로 못감)
         wait();
      } catch(InterruptedException e) {}
   }
}