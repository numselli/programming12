package circle;

public class circle { 
	private double radius = 0;
	
	public circle(double rad){
		if (rad >= 0) radius = rad;
		else System.out.println("Invalid radius");
	}
	public circle(){
	}
	public void setRadius(double rad) {
		if (rad >= 0) radius = rad;
		else System.out.println("Invalid radius");
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	public double getCircumferenc() {
		return (Math.PI * (radius * 2));
	}
	public String toString() {
		return "radius: "+radius + ", area: " + getArea() + ", cumferenc: " + getCircumferenc();
	}
}
