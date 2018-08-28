package sec1_verify;

public class Exercise02 {

	public static void main(String[] args) {
		Exercise01[] arr = new Exercise01[4];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]= new Exercise01();
			arr[i].setCurrSpeed(i);
			arr[i].setMaxSpeed(i);
			arr[i].setModifiedSpeed(i);
			
			System.out.println(arr[i]);
			System.out.println();
		}

	}

}
