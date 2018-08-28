package sec01_exam_OverridingTest;

public class UsbMemory extends HddDisk{

	int capacity;
	int rpm;
	
	public UsbMemory(int c , int r) {
		super(10,50);
		this.capacity = c;
		this.rpm = r;
	}
	
	@Override
	public String Status() {
		return "USB 메모리 용량은 " + this.capacity + "GB이며, RPM은 " + this.rpm +"입니다.";
	}
}
