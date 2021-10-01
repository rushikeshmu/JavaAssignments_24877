package base;

public class ShapeTest {

	public static void main(String[] args) {
	Shape [] shapes = {new Circle(10),new Rectangle(10,10),new Triangle(10,10, 10)};
	for(Shape shape :shapes) {
		
		shape.calculateArea();
	}

	}

}
