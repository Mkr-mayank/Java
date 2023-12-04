import java.util.*;
class Student{
	int roll;
	void getRoll(Scanner sc){
		System.out.print("Enter your Roll: ");
		roll=sc.nextInt();
	}
	void displayRoll(){
		System.out.println("Roll: "+roll);
	}
}
class Test extends Student{
	float m1,m2;
	void getMarks(Scanner sc){
		System.out.print("Enter Marks in Subject 1 and Subject 2: ");
		m1=sc.nextFloat();
		m2=sc.nextFloat();
	}
	void displayMarks(){  
		System.out.println("Marks in Subject 1: "+m1);
		System.out.println("Marks in Subject 2: "+m2);
	}
}
interface Games{
	double gamewt=8.0;
	void displayWt();
}
class Result extends Test implements Games{
	public void displayWt(){
		System.out.println("Score in Games: "+gamewt);
	}
}
public class A6P6{
	public static void main(String args[]){
		Student s1=new Student();
		Test t1=new Test();
		Result r1=new Result();
		Scanner sc=new Scanner(System.in);
		s1.getRoll(sc);
		t1.getMarks(sc);
		s1.displayRoll();
		t1.displayMarks();
		r1.displayWt();
	}
}
