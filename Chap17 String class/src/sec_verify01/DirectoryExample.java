package sec_verify01;

public class DirectoryExample {

	public static void main(String[] args) {
		 String data = "D:/내폴더/photo/2016/travel/food.jpg";
		 String[] arr = data.split("/");
		 
		 System.out.println("파일 이름 : "+arr[5].substring(0, 4));
		 System.out.println("확장자 : "+arr[5].substring(5));
		 int index = data.indexOf("f")-1;
		 System.out.println("폴더 이름 : "+data.substring(0, index));
	}
}
