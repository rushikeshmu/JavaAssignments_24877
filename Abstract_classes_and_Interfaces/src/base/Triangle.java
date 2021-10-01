package base;

public class Triangle extends Shape {
	double a,b,c;
	

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}


	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		double s = (a+b+c)/2;
		double p = s *(s-a)*(s-b)*(s-c);
		System.out.println("Area of Triangle");
		System.out.println(Math.sqrt(p) + " sq. units");
		
	}
	

}
