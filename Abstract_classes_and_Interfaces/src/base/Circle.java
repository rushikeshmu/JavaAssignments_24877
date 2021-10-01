package base;

public class Circle extends Shape implements Printable {
	double radius;
	

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public void calculateArea() {
		System.out.println("Area of circle");
		
		System.out.println(Math.PI * getRadius()*getRadius() + " sq. units");
		
		
	}


	@Override
	public void print() {
		System.out.println("Circle");
		
	}

}
