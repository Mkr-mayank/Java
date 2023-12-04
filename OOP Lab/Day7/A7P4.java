import shapePack.*;
class Parallelpiped implements Shape3D{
	double l,b,h;
	Parallelpiped(double l, double b, double h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void calcVolume(){
		System.out.println("Volume of Parallelpiped: "+(l*b*h));
    	}
   	public void calcSurfaceArea(){
        	System.out.println("Surface Area of Parallelpiped: "+(2*(l*b+b*h+h*l)));
    	}
}
class Cube implements Shape3D{
	double s;
	Cube(double s){
		this.s=s;
    	}
    	public void calcVolume(){
        	System.out.println("Volume of Cube: "+(s*s*s));
    	}
    	public void calcSurfaceArea(){
        	System.out.println("Surface Area of Cube: "+(6*s*s));
    	}
}
class Sphere implements Shape3D{
	double r;
    	Sphere(double r){
		this.r=r;
    	}
    	public void calcVolume(){
        	System.out.println("Volume of Sphere: "+((4.0/3)*PI*r*r*r));
    	}
    	public void calcSurfaceArea(){
        	System.out.println("Surface Area of Sphere: "+(PI*r*r));
    	}
}
public class A7P4 {
    	public static void main(String args[]){
		Parallelpiped p1=new Parallelpiped(3.0,4.0,5.0);
		Cube c1=new Cube(4.0);
		Sphere s1=new Sphere(7.0);
		p1.calcVolume();
		p1.calcSurfaceArea();
		c1.calcVolume();
		c1.calcSurfaceArea();
		s1.calcVolume();
		s1.calcSurfaceArea();
	}
}
