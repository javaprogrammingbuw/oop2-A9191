
public class Driver {
	
	public static void main (String[] args){
		
		Triangle triangle= new Triangle(2.0,6.0);
		Circle circle = new Circle(2.0);
		Square square = new Square(2.0,2.0);
		System.out.println("triangle.area= "+triangle.area() +"        triangle.circumference= "+ triangle.circumference());
		System.out.println("circle.are= "+circle.area() +"         circle.circumference= "+ circle.circumference());
		System.out.println("square.area= "+square.area() +"          square.circumference= "+ square.circumference());
	}

}
