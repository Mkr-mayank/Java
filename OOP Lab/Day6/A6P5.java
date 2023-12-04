interface Department{
	String deptName="CSE";
	String deptHead="AP";
	void printData();

}
class Hostel implements Department{
	String hostelName;
	String hostelLocation;
	int rooms;
	public void getData(String hostelName, String hostelLocation, int rooms){
		this.hostelName=hostelName;
		this.hostelLocation=hostelLocation;
		this.rooms=rooms;
	}
	public void printData(){
		System.out.println("Department Name: "+deptName);
		System.out.println("Head of Department: "+deptHead);
		System.out.println("Hostel Name: "+hostelName);
		System.out.println("Hostel Location: "+hostelLocation);
		System.out.println("Number of rooms: "+rooms);
	}
}
class Student extends Hostel{
	String studentName;
	int regNo;
	int electiveSubjects;
	double avgmarks;
	public void getData(String hostelName, String hostelLocation, int rooms, String studentName, int regNo, int electiveSubjects, double avgmarks){
		super.getData(hostelName,hostelLocation,rooms);
		this.studentName=studentName;
		this.regNo=regNo;
		this.electiveSubjects=electiveSubjects;
		this.avgmarks=avgmarks;
	}
	public void printData(){
		super.printData();
		System.out.println("Student Name: "+studentName);
		System.out.println("Registration No: "+regNo);
		System.out.println("Number of elective Subjects: "+electiveSubjects);
		System.out.println("Average Marks: "+avgmarks);
	}
}
public class A6P5{
	public static void main(String args[]){
		Student s1=new Student(); 
		s1.getData("ON","Kolaghat",30,"Sudip",1234,6,90.0);
		s1.printData();
	}
}
