package rectangle;

import java.util.Scanner;

public class RectangleTester {
	public static void main(String[] args) {
//		Rectangle box1 = new Rectangle(3, 10); 
//		System.out.println("getLength: " + box1.getLength());
//		System.out.println("getWidth: " + box1.getWidth());
//		System.out.println("getArea: " + box1.getArea());
//		System.out.println("getPerimeter: " + box1.getPerimeter());
		
		
		// roomAreaCalulator
		Scanner input = new Scanner(System.in); 
		
//		kitchen
		System.out.println("Enter in the length of the kitchen");
		double kitchenLength = input.nextDouble(); 

		System.out.println("Enter in the width of the kitchen"); 
		double kitchenWidth = input.nextDouble(); 
		Rectangle kitchen = new Rectangle(kitchenLength, kitchenWidth); 

//		den
		System.out.println("Enter in the length of the den");
		double denLength = input.nextDouble(); 

		System.out.println("Enter in the width of the den"); 
		double denWidth = input.nextDouble(); 
		Rectangle den = new Rectangle(denLength, denWidth); 

//		bedroom
		System.out.println("Enter in the length of the bedroom");
		double bedroomLength = input.nextDouble(); 

		System.out.println("Enter in the width of the bedroom"); 
		double bedroomWidth = input.nextDouble(); 
		Rectangle bedroom = new Rectangle(bedroomLength, bedroomWidth); 

		double totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea(); 
		System.out.printf("The total area of the rooms is %.2f", totalArea); 
	}
}
