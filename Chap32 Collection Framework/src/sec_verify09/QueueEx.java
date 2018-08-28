package sec_verify09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {

	static Queue<String> q = new LinkedList<String>();
	static final int MAX_SIZE = 5;
	
	public static void save(String input) {
		while(q.size() >= MAX_SIZE) {
			q.poll();
		}
		q.offer(input);
	}
	public static void help() {
		System.out.println("help - 도움말을 보여줍니다. \nq 또는 Q - 프로그램을 종료합니다."
				+ "\nhistory - 최근에 입력한 명령어를 5개 보여줍니다.");
	}
	public static void history() {
		for(Object each : QueueEx.q) {
			System.out.println(each);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		while(true) {
			System.out.println(">>");
			String input = scan.next();
			if(input.equals("history"))
				QueueEx.history();
			else if(input.equals("q") || input.equals("Q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(input.equals("help"))
				QueueEx.help();
			else {
				System.out.println(input);
				QueueEx.save(input);
			}
		}
		scan.close();
	}
}
