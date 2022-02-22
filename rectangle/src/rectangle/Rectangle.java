package rectangle;

public class Rectangle {
	private double length = 0;
	private double width = 0;
	
	public Rectangle(double inlength, double inwidth){
		if (inwidth >= 0) width = inwidth;
		else System.out.println("Invalid width");
		
		if (inlength >= 0) length = inlength;
		else System.out.println("Invalid length");
	}
	public void setLength(double len) {
		if (len >= 0) length = len;
		else System.out.println("Invalid length");
	}
	public void setWidth(double wid) {
		if (wid >= 0) width = wid;
		else System.out.println("Invalid width");
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return (length*2)+(width*2);
	}
	public String toString() {
		return "width: "+width + " length: " + length;
	}
}
