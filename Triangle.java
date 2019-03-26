
public class Triangle extends Shape implements iRightAngled {
	double a;
	double b;
	public Triangle(double a,double b){
		this.a = a;
		this.b = b;
	}
	
	public double area() {
		return a*b*1/2;
 	}

	public double circumference() {
		return a +b + pythagoras();	
	}

	public double pythagoras(){
		return Math.sqrt(a*a+b*b);
 	}
}