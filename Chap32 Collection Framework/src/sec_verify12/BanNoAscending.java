package sec_verify12;

import java.util.Comparator;

public class BanNoAscending implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		if(o1.ban == o2.ban)
			return Integer.compare(o1.no, o2.no);
		return Integer.compare(o1.ban, o2.ban);
	}
}
