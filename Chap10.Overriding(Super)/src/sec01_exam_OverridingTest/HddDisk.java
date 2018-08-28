package sec01_exam_OverridingTest;

public class HddDisk {

	int capacity;
	int rpm;
	
	public HddDisk() {}
	
	public HddDisk(int c, int r) {
		this.capacity = c;
		this.rpm = r;
	}
	
	public String Status() {
		return "하드디스크의 용량은 " + this.capacity + "GB이며, RPM은 " + this.rpm+"입니다. "; 
	}
}
