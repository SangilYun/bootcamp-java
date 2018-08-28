package sec_verify11;

public class Task implements Priority {

	String taskName;
	int time;
	int priority_number;
	
	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority_number = priority;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPriority_number() {
		return priority_number;
	}
	public void setPriority_number(int priority_number) {
		this.priority_number = priority_number;
	}
	
	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return this.priority_number;
	}

	@Override
	public void setPriority(int num) {
		// TODO Auto-generated method stub
		this.priority_number = num;
	}
	

}
