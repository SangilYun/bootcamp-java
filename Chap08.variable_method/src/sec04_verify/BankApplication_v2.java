package sec04_verify;

import java.util.Scanner;

public class BankApplication_v2 {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int accountNumber = 0;
	
	private static void createAccount() {
		System.out.println("--------------\n1.계좌생성\n--------------");

		System.out.println("번호 : ");
		String ano = scanner.next();
		
		System.out.println("계좌주 : ");
		String name = scanner.next();
		
		System.out.println("초기입금액 : ");
		int balance = scanner.nextInt();
		
		Account newUser = new Account(ano, name, balance);
		accountArray[accountNumber] = newUser;
		accountNumber ++;
	}
	
	private static void accountList() {
		System.out.println("--------------\n2.계좌목록\n--------------");
		
		for(int i=0; i<accountNumber;i++) {
			String ano = accountArray[i].getAno();
			String owner = accountArray[i].getOwner();
			int balance = accountArray[i].getBalance();
			System.out.printf("%15s %15s %15d\n",ano,owner,balance);
		}
	}
	
	private static void deposit() {
		System.out.println("--------------\n3.예금\n--------------");
		Account matched = findAccount();
		int balance = setting(matched, scanner);
		if(balance !=0) 
			matched.setBalance(balance);
	}
	
	private static void withdraw() {
		System.out.println("--------------\n4.출금\n--------------");
		Account matched = findAccount();
		int balance = setting(matched, scanner);
		if(balance !=0)
			matched.setBalance(-balance);
	}
	
	private static Account findAccount() {
		System.out.println("계좌 입력 : ");
		String ano = scanner.next();
		Account matched = findAccount(ano);
		return matched;
	}
	
	private static int setting(Account matched ,Scanner scanner) {
		int balance = 0;
		if(matched == null) {
			System.out.println("일치하는 계좌가 없습니다.");
			return 0;
		}
		else {
			System.out.println("출금/예금액 : ");
			balance = scanner.nextInt();
		}
		return balance;
	}
	
	private static Account findAccount(String ano) {
		
		for(int i=0; i<accountNumber; i++) {
			String foundAccount = accountArray[i].getAno();
			if(foundAccount.equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		int input;
		while(true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.println("입력 : ");
			
			input = scanner.nextInt();
			
			if(input == 1)
				BankApplication_v2.createAccount();
			else if(input == 2)
				BankApplication_v2.accountList();
			else if(input == 3)
				BankApplication_v2.deposit();
			else if(input == 4)
				BankApplication_v2.withdraw();
			else if(input == 5) {
				System.out.println("종료합니다.");
				break;
			}
			else
				System.out.println("잘못 입력하셨습니다.");
		}
	}
}
