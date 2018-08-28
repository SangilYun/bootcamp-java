package Vector;

import java.util.Vector;

public class testtest {

	public static void main(String[] args) {
		 Vector v = new Vector(5);
		 v.add("1");
		 v.add("2");
		 v.add("3");
		 System.out.println("capa : "+v.capacity());

		 v.trimToSize();
		 System.out.println("capa : "+v.capacity());

		 v.ensureCapacity(6);
		 System.out.println("capa : "+v.capacity());

		 v.setSize(7);
		 System.out.println("capa : "+v.capacity());
		 
		 v.setSize(13);
		 System.out.println("capa : "+v.capacity());
		 
		 v.setSize(25);
		 System.out.println("capa : "+v.capacity());
		 
		 v.setSize(97);
		 System.out.println("capa : "+v.capacity());


	}

}
