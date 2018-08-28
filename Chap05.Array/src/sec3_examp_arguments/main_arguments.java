package sec3_examp_arguments;

public class main_arguments {
	//main()의 매개변수값을 설ㅈ렁하기 위하여 메뉴탭중 Run을 선택하고
	//run_configuration을 클릭하여 들어간다. 그리고 매개변수값을 지정하면 된다.
	//arguments(매개변수) 100 100 입력하면 이 프로그램 실행하면 100+100=200이 출력될 것.
	public static void main(String[] args) {
		
		if(args.length!=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		String strNum1=args[0];
		String strNum2=args[1];
		
		int num1=Integer.parseInt(strNum1);
		int num2=Integer.parseInt(strNum2);
		
		int result=num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		
	}

}
