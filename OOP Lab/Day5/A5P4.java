import java.util.*;
class Vehicle{
	int speed,wheel;
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the speed of vehicle: ");
		speed=sc.nextInt();
		System.out.print("Enter the number of wheels: ");
		wheel=sc.nextInt();
	}
	void printData(){
		System.out.println("Speed: "+speed);
		System.out.println("Number of Wheel: "+wheel);
	}
}
class Car extends Vehicle{
	int nop;
	void getData(){
		super.getData();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of passengers: ");
		nop=sc.nextInt();
	}
	void printData(){
		super.printData();
		System.out.println("Number of Passengers: "+nop);
	}
}
class Truck extends Vehicle{
	int loadlimit;
	void getData(){
		super.getData();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the load limit: ");
		loadlimit=sc.nextInt();
	}
	void printData(){
		super.printData();
		System.out.println("Load Limit: "+loadlimit);
	}
}
public class A5P4{
	public static void main(String args[]){
		Car c1=new Car();
		Truck t1=new Truck();
		System.out.println("Enter Car Data: ");
		c1.getData();
		System.out.println("Required Car Data is: ");
		c1.printData();
		System.out.println("Enter Truck Data: ");
		t1.getData();
		System.out.println("Required Truck Data is: ");
		t1.printData();
		if(c1.speed>t1.speed){
			System.out.println("Car is faster");
		}
		else{
			System.out.println("Truck is faster");
		}
	}
}
