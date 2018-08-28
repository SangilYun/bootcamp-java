package sec_verify11;

public class TaskExample {

	public static void main(String[] args) {
		
		Task engStu = new Task("영어공부", 3);
		Task matStu = new Task("수학공부", 1);
		Task javStu = new Task("자바공부", 2);

		engStu.setTime(30);
		matStu.setTime(80);
		javStu.setTime(150);
		
		System.out.println("나의 우선순위별 업무리스트");
		System.out.printf("%-10s %-10s %-10s\n","일의 이름","소요시간(분)","우선순위");
		System.out.printf("%-12s %-13d %d\n", engStu.getTaskName(), engStu.getTime(), engStu.getPriority());
		System.out.printf("%-12s %-13d %d\n", matStu.getTaskName(), matStu.getTime(), matStu.getPriority());
		System.out.printf("%-12s %-13d %d\n", javStu.getTaskName(), javStu.getTime(), javStu.getPriority());

	}

}
