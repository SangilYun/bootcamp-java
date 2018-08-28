package sec06_exam_singleton;

import java.util.Scanner;

public class WordGameApp {
	private Scanner scan;
	private String startWord = "father";
	private Player[] players;
	
	WordGameApp(){
		scan = new Scanner(System.in);
	}
	
	public void createPlayers() {
		System.out.println("how many players are there ? : ");
		int input = scan.nextInt();
		players = new Player[input];
		for(int i = 0 ; i<players.length;i++) {
			System.out.println("Player name ? :");
			players[i] = new Player(scan.next());
		}
		
	}
	
	public void run() { 
		createPlayers();
		System.out.println("starting word : " + startWord);
		Player.prevWord = startWord;
		while(true) {
			for(int i = 0 ; i<players.length;i++) {
				String currWord = players[i].sayWord();
				if(!players[i].succeed(currWord)) {
					System.out.println(players[i].getName()+"가 졌습니다.");
					return ;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		WordGameApp test = new WordGameApp();
		test.run();
	}
}
