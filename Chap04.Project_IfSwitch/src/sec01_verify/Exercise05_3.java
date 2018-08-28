package sec01_verify;
import java.util.Scanner;

public class Exercise05_3 {

	public static void main(String[] args) {
		int amount;
		int basic;
		double price;
		double tax;
		double total;
		
		System.out.println("전기사용량을 입력하세요(kw) : ");
		Scanner scan = new Scanner(System.in);
		amount = scan.nextInt();
			
		/*if(amount>=1 && amount <=100) {
			basic = 370;
			price = amount *52.0;	
		} 
		else if(amount>=101 && amount<=200) {
			basic = 660;
			price = 52.0* 100;
			price +=(amount - 100)*88.5;
		}
		else if(amount>=201 && amount<=300) {
			basic = 1130;
			price = 52.0* 100;
			price +=88.5* 100;
			price +=(amount - 200)*127.8;
		}
		else if(amount>=301 && amount<=400) {
			basic = 2710;
			price = 52.0* 100;
			price +=88.5 *100;
			price +=127.8 *100;
			price +=(amount - 300)*184.3;
		}
		else if(amount>=401 && amount<=500) {
			basic = 2710;
			price = 52.0* 100;
			price +=88.5 *100;
			price +=127.8 *100;
			price +=184.3 *100;
			price +=(amount - 400)*274.3;
		}
		else {
			basic = 2710;
			price = 52.0* 100;
			price +=88.5 *100;
			price +=127.8 *100;
			price +=184.3 *100;
			price +=274.3 *100;
			price +=(amount - 500)*494.0;
		}
		
		tax = (basic + price)*0.09;
		total = basic + price + tax;
		System.out.println("이번달 요금은 "+(Math.round(total))+"원 입니다.");
		*/
		
		switch(amount/100) {
		case 0:
			basic = 370;
			price = amount *52.0;	
			break;
		case 1:
			basic = 660;
			price = 52.0* 100;
			price +=(amount - 100)*88.5;
			break;
		case 2:
			basic = 1130;
			price = 52.0* 100;
			price +=88.5* 100;
			price +=(amount - 200)*127.8;
			break;
		case 3:
			basic = 2710;
			price = 52.0* 100;
			price +=88.5 *100;
			price +=127.8 *100;
			price +=(amount - 300)*184.3;
			break;
		case 4:
			basic = 2710;
			price = 52.0* 100;
			price +=88.5 *100;
			price +=127.8 *100;
			price +=184.3 *100;
			price +=(amount - 400)*274.3;
				break;
		default:
			basic = 2710;
			price = 52.0* 100;
			price +=88.5 *100;
			price +=127.8 *100;
			price +=184.3 *100;
			price +=274.3 *100;
			price +=(amount - 500)*494.0;
			break;
		}
		tax = (basic + price)*0.09;
		total = basic + price + tax;
		System.out.println("이번달 요금은 "+(Math.round(total))+"원 입니다.");
		scan.close();
	}

}
