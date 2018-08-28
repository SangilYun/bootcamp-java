package Week4;

import java.io.File;

import edu.duke.DirectoryResource;
import edu.duke.ImageResource;
import edu.duke.Pixel;

public class GrayScaleConverter {
	//I started with the image I wanted(inImage)
	public ImageResource makeGray(ImageResource inImage) {
	//I made a blank image of the same size
			ImageResource outImage = new ImageResource(inImage.getWidth(),inImage.getHeight());
			//for each pixel in outImage
			for(Pixel pixel : outImage.pixels()) {
				//look at the corresponding pixel in inImage
				Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
				//compute inPixel's average
				int average = (inPixel.getRed() + inPixel.getGreen() + inPixel.getBlue())/3;
				//set pixel's red to average
				pixel.setRed(average);
				//set pixel's green to average
				pixel.setGreen(average);
				//set pixel's blue to average
				pixel.setBlue(average);
			}
			//outImage is your answer
			return outImage;
	}
	
	public void testGray() {
		ImageResource ir = new ImageResource();
		ImageResource gray = makeGray(ir);
		gray.draw();
	}
	
	public void selectAndConvert() {
		DirectoryResource dr = new DirectoryResource();
		for(File f : dr.selectedFiles()) {
			ImageResource inImage = new ImageResource(f);
			ImageResource gray = makeGray(inImage);
			gray.draw();
		}
	}
	public static void main(String[] args) {
		GrayScaleConverter test = new GrayScaleConverter();
//		test.testGray();
		test.selectAndConvert();
	}

}
