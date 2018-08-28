package sec02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	//매개변수를 출력하는 메서드 빈번하게 사용하게 될 경우 메서드로 만들어서 
	//호출만하는 것이 바람직한 방법이다. 
	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getSimpleName());			
			if(i<(parameters.length-1))
				System.out.print(", ");
		}
	}
	
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("sec02_reflection.Car");
		System.out.println("[클래스 이름]" + clazz.getName());
		System.out.println("[클래스 이름]" + clazz.getSimpleName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
		//Car클래스에만 선언된 생성자 정보만 출력(접근제어자에 관계없음)
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			
			//생성자의 매개변수 타입정보 얻기
			Class[] parameters = constructor.getParameterTypes();
			
			for(int i=0; i<parameters.length; i++) {
				System.out.println(parameters[i].getSimpleName()); //생성자 매개변수 타입 출력 
				//쉼표로 구분하고자 함
				if(i<(parameters.length-1)) {
					System.out.print(", ");
				}
			}
			//printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
	
		//Car클래스에만 선언된 필드 정보만 출력(접근제어자에 관계없음)
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName()+ " " + field.getName());
		}
		System.out.println();
		
		//Car 클래스에만 선언된 메서드 정보만 출력(접근제어자에 관계없음)
		System.out.println("[메서드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method method : methods) {
			System.out.print(method.getReturnType().getSimpleName()); // 리턴타입 정보 출력
			System.out.print(method.getName()+"(");
			Class[] parameters = method.getParameterTypes(); //메서드의 매개변수 타입정보 얻기
			printParameters(parameters); //정적메서드 호출
			System.out.println(")");
		}
	}
}
