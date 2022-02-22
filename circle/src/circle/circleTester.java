package circle;

public class circleTester {
	public static void main(String[] args) {
		circle circleObject = new circle();
		
		circleObject.setRadius(5.4);
		
		double area = circleObject.getArea();
		System.out.printf("area : %f\n", area);
		
		double circumferenc = circleObject.getCircumferenc();
		System.out.printf("circumferenc : %f\n", circumferenc);
		
		String string = circleObject.toString();
		System.out.printf("toString : %s\n", string);
	}
}
