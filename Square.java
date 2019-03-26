
public class Square extends Shape{
	double width;
	double height;
	
	public Square(double width,double height){
		this.height = height;
		this.width = width;
	}

	public double area() {
		return width*height;
	}

	public double circumference() {
		return 4*width;
	}

}
