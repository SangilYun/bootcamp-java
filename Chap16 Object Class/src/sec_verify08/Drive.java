package sec_verify08;

import java.util.Arrays;

import sec04_deep_clone.Car;

public class Drive implements Cloneable{

	String name;
	int size;
	String[] driverList;
	Folder folder;
	
	public Drive(String n, int s, String[]	d, Folder f) {
		this.name = n;
		this.size = s;
		this.driverList = d;
		this.folder = f;
	}
	
	protected Object clone() {
		Drive cloned = null;
		try {
			cloned = (Drive)super.clone();
			cloned.driverList = Arrays.copyOf(driverList, this.driverList.length);
			cloned.folder = new Folder(this.folder.name, this.folder.size);		
		}
		catch(CloneNotSupportedException e) {
			
		}
		return cloned;
	}
	
	public String toString() {
		return "이름 : "+this.name + "\n크기 : " + this.size + "\n폴더 목록 : " + Arrays.toString(this.driverList)+ "\n새 폴더명 : "
				+this.folder.name + "\n크기 : " + this.folder.size;
	}
}
