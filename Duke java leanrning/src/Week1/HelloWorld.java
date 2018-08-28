package Week1;

import edu.duke.FileResource;

public class HelloWorld {
	public void runHello() {
		FileResource f;
		f = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/course material/hello/hello_unicode.txt");
		for (String line : f.lines()) {
			System.out.println(line);
		}
	}
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.runHello();

	}

}
