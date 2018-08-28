package sec09_verify;

import java.util.Scanner;

public class ProductExample {

	static int productID = 0;
	static int numberOfProduct =0;
	static Product[] p = new Product[10];
	
	private static void addProduct(int type) {
		if(productID >= p.length) {
			System.out.println("배열 꽉 찼다");
			return;
		}
		else if(type == 1) {
			p[productID] = new Book(productID, "몬스터 길들이는 책", "넷마블", 0, 1, "몬스터길들이기", "개발1팀");
		}
		else if(type ==2) {
			p[productID] = new CompactDisc(productID, "태양의후예OST", "idk", 35000, "말해뭐해", "케이윌");
		}
		else if(type ==3) {
			p[productID] = new ConversationBook(productID, "아이들이 좋아함", "생능출판", 25000, 3, "ING영어", "김수로", "영어");
		}
		p[productID].showInfo();
		productID++;
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		while(true) {
			System.out.println("상품 추가(1), 모든 상품 조회(2), 끝내기(3) : ");
			input = scan.nextInt();
			if(input == 1) {
				System.out.println("상품 종류 | 책(1), 음악CD(2), 회화책(3) : ");
				addProduct(scan.nextInt());
			}else if(input == 2) {
				if(productID ==0) {
					System.out.println("추가하신 상품이 없습니다.");
				}
				else {
					for(int i =1; i<=productID;i++) {
						System.out.println("상품 ID : " + i);
						p[i-1].showInfo();
						System.out.println("==============================");
					}
				}
			}
			else if(input == 3) {
				break;
			}
			else {
				System.out.println("잘못 입력.");
			}
		}
		scan.close();
	}
}
