package Week4;

import java.io.File;

import edu.duke.DirectoryResource;
import edu.duke.ImageResource;
import edu.duke.Pixel;

public class ImageConvertSave {

	public ImageResource ImageConverter(ImageResource inImage) {
		ImageResource outImage = new ImageResource(inImage.getWidth(),inImage.getHeight());
		for(Pixel pixel : outImage.pixels()) {
			Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
			int average = (inPixel.getBlue() + inPixel.getGreen() + inPixel.getRed())/3;
			pixel.setBlue(average);
			pixel.setGreen(average);
			pixel.setRed(average);
		}
		return outImage;
	}
	
	public void doSave() {
		DirectoryResource dr = new DirectoryResource();
		for(File f : dr.selectedFiles()) {
			ImageResource ir = new ImageResource(f);
			ImageResource converted = ImageConverter(ir);
			
			String oldName = ir.getFileName();
			String newName = "gray-"+ oldName;
//			System.out.println("file name : " + ir.getFileName());
			converted.setFileName(newName);
			converted.draw();
			converted.save();
		}
	}
	
	public ImageResource inversion(ImageResource inImage) {
		ImageResource outImage = new ImageResource(inImage.getWidth(),inImage.getHeight());
		for(Pixel pixel : outImage.pixels()) {
			Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
			int inversionBlue = 255- inPixel.getBlue();
			int inversionGreen = 255- inPixel.getGreen();
			int inversionRed = 255- inPixel.getRed();
			pixel.setBlue(inversionBlue);
			pixel.setGreen(inversionGreen);
			pixel.setRed(inversionRed);
		}
		return outImage;
	}
	
	
	public void inversionSave() {
		DirectoryResource dr = new DirectoryResource();
		for(File f : dr.selectedFiles()) {
			ImageResource ir = new ImageResource(f);
			ImageResource converted = inversion(ir);
			
			String oldName = ir.getFileName();
			String newName = "inverted-"+ oldName;
//			System.out.println("file name : " + ir.getFileName());
			converted.setFileName(newName);
			converted.draw();
//			converted.save();
		}
	}
	
	public static void main(String[] args) {
		ImageConvertSave test =  new ImageConvertSave();
//		test.doSave();
		test.inversionSave();
		

	}

}
