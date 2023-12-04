import java.util.*;
class Area{
	double l,b;;
	Area(double l,double b){
		this.l=l;
		this.b=b;
	}
	double returnArea(){
		return l*b;
	}
}
public class A5P1{
	public static void main(String args[]){
		double l,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length and breadth of rectangle: ");
		l=sc.nextDouble();
		b=sc.nextDouble();
		Area a1=new Area(l,b);
		System.out.println("Area of rectangle is: "+a1.returnArea());
	}
}
