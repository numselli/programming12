package rectangle;

public class RectangleTester {
	public static void main(String[] args) {
		Rectangle box1 = new Rectangle(3, 10); 
		
		System.out.println("getLength: " + box1.getLength());
		System.out.println("getWidth: " + box1.getWidth());
		System.out.println("getArea: " + box1.getArea());
		System.out.println("getPerimeter: " + box1.getPerimeter());
	}
}
