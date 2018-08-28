package sec_verify10;

class MyThread implements Runnable {
	String name;
	Thread t;
	
    public MyThread (String thread){
	    this.name = thread; 
	    t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
    }
 
 
	public void run() {
		try {
		     for(int i = 5; i > 0; i--) {
		     System.out.println(name + ": " + i);
		     Thread.sleep(1000);
		     }
		}
		catch (InterruptedException e) {
		     System.out.println(name + "Interrupted");
		}
		     System.out.println(name + " exiting.");
		}
	}