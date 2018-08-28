package sec_verify06;

public class PriorityThreadExample {

	public static void main(String[] args) {
		 PriorityThread power = new PriorityThread("Power");
		 PriorityThread water = new PriorityThread("Water");
		 PriorityThread fire = new PriorityThread("Fire");
		 
		 power.setPriority(10);
		 water.setPriority(5);
		 fire.setPriority(1);
		 
		 power.start();
		 water.start();
		 fire.start();
	}
}
