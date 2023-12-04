import java.util.*;
class CSEallStudent{
	int roll;
	String name;
	final static String dept="CSE";
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name: ");
		name=sc.nextLine(); 
		System.out.print("Enter the roll: ");
		roll=sc.nextInt();
	}
	void putData(){
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Department: "+dept);
	}
	final void deptRules(){
		System.out.println("Ragging is not allowed");
		System.out.println("Attendance should not be lesser than 90%");
	}
}
class CSE3year extends CSEallStudent{
	int java_marks;
	String tech_fest_part;
	void getData(){
		super.getData();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the program partcipated in Tech Fest: ");
		tech_fest_part=sc.nextLine();
		System.out.print("Enter the marks in java: ");
		java_marks=sc.nextInt();
	}
	void putData(){
		super.putData();
		System.out.println("Marks in java: "+java_marks);
		System.out.println("Program participated in Tech Fest: "+tech_fest_part);
	}
}
class CSE4year extends CSEallStudent{
	int proj_marks;
	String placement;
	void getData(){
		super.getData();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Company in which you got Placement: ");
		placement=sc.nextLine();
		System.out.print("Enter Project Marks: ");
		proj_marks=sc.nextInt();
	}
	void putData(){
		super.putData();
		System.out.println("Project Marks: "+proj_marks);
		System.out.println("Company in which you got placement: "+placement);
	}
}
public class A5P5{
	public static void main(String args[]){
		CSE3year y3=new CSE3year();
		CSE4year y4=new CSE4year();
		y3.getData();
		y3.putData();
		y4.getData();
		y4.putData();
	}
}
