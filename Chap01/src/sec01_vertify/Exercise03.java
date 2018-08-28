package sec01_vertify;

public class Exercise03 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		int pencilsPerStudent;
		
		pencilsPerStudent = pencils/students;
		System.out.println("학생 한 명이 가지는 연필 수 :" + pencilsPerStudent);
		System.out.println("남은 연필 수 " + (pencils%students));

	}

}
