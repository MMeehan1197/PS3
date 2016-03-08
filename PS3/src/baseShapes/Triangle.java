package baseShapes;

public class Triangle {

	
	//For the sides, side 2 will be the base in order to find the area
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	
	//Constructor that doesn't have the default values of 1, 1,and 1
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	//The default no-arg Constructor that uses the default values of 1, 1, and 1
	public Triangle() {
		super();
	}
	
	//This method returns the Perimeter of the Triangle by adding all the Triangle's sides
		public double getPerimeter(Triangle t){
			return t.getSide1() + t.getSide2() + t.getSide3();
		}
	
	/**
	 *	The getSP method is needed because I need the Semi-Perimeter of the triangle to use Heron's formula, which is
	 *	sqrt(s(s-a)(s-b)(s-c)) in order to find the area of the triangle 
	 *
	 */
	
	//Gets the SemiPerimeter of the Triangle using the already existing getPerimeter() method
	public double getSP(Triangle t){
		return t.getPerimeter(t) / 2;
	}
	
	//This method now uses Heron's Formula to calculate the area of the Triangle
	public double getArea(Triangle t){
		double s = t.getSP(t);
		return Math.sqrt(s*s-t.getSide1()*s-t.getSide2()*s-t.getSide3());
	}
	
	
	//This method returns all of the sides of the Triangle as well as the perimeter of the triangle and the area in one concise String
	public String toString(Triangle t){
		return "The triangle has 3 sides of " + t.getSide1() + " " + t.getSide2() + " " + t.getSide3() + " and has a perimeter of " 
	+ t.getPerimeter(t) + " and an Area of " + t.getArea(t); 
	}
	
	

	
	//Accessor Methods
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	
}
