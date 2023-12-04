import java.util.*;
class Complex{
	double r1,r2,i1,i2;
	Complex(double r1,double i1,double r2,double i2){
		this.r1=r1;
		this.i1=i1;
		this.r2=r2;
		this.i2=i2;
	}
	void Sum(){
		System.out.println("Sum of real part is "+(r1+r2)+" and imaginary part is "+(i1+i2));
	}
	void Difference(){
		System.out.println("Difference of real part is "+(r1-r2)+" and imaginary part is "+(i1-i2));
	}
	void Product(){
		double pr=(r1*r2)-(i1*i2);
		double pi=(r1*i2)+(r2*i1);
		System.out.println("Product of real part is "+pr+" and imaginary part is "+pi);
	}
}
public class A5P2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double r1,r2,i1,i2;
		System.out.print("Enter the real and imaginary part of first number: ");
		r1=sc.nextDouble();
		i1=sc.nextDouble();
		System.out.print("Enter the real and imaginary part of second number: ");
		r2=sc.nextDouble();
		i2=sc.nextDouble();
		Complex c1=new Complex(r1,i1,r2,i2);
		c1.Sum();
		c1.Difference();
		c1.Product();
	}
}
