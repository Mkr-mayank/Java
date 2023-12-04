abstract class Shape{
	abstract void RectangleArea(double l, double b);
	abstract void SquareArea(double s);
	abstract void CircleArea(double r);
}
class Area extends Shape{
	void RectangleArea(double l, double b){
		System.out.println("Area of rectangle of length "+l+" and breadth "+b+" is "+(l*b));
	}
	void SquareArea(double s){
		System.out.println("Area of Square of side "+s+" is "+(s*s));
	}
	void CircleArea(double r){
		System.out.println("Area of Circle of radius "+r+" is "+((22.0/7.0)*r*r));
	}
}
public class A6P2{
	public static void main(String args[]){
		Area a1=new Area();
		a1.RectangleArea(5.5,3.5);
		a1.SquareArea(4.5);
		a1.CircleArea(7.0);
	}
}
