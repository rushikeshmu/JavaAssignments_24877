package base;

public class Rectangle extends Shape {
	
	double width;
	double height;
	

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public void calculateArea() {
		
		System.out.println("Area of Reactangle : ");
		System.out.println(this.getHeight()*this.getWidth() + " sq. units");
		
		
	}

}
