package Week4;

import java.io.File;

import edu.duke.DirectoryResource;
import edu.duke.ImageResource;

public class ImageSaver {
	
	public void doSave() {
		DirectoryResource dr = new DirectoryResource();
		for (File f : dr.selectedFiles()) {
			ImageResource ir = new ImageResource(f);
			String fname = ir.getFileName();
			String newName = "copy -" + fname;
			ir.setFileName(newName);
			ir.draw();
			ir.save();
		}
	}
	public static void main(String[] args) {
		ImageSaver test = new ImageSaver();
		test.doSave();
	}

}
