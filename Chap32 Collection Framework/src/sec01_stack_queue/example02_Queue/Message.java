package sec01_stack_queue.example02_Queue;

public class Message {

	private String command;
	private String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to= to;
	}
	
	public String getCommand() {
		return command;
	}
	
	public String getTo() {
		return to;
	}
}
