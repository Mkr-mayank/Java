import java.util.*;
class Person{
	String name,address;
	int age;
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		name=sc.nextLine();
		System.out.print("Enter your address: ");
		address=sc.nextLine();
		System.out.print("Enter your age: ");
		age=sc.nextInt();
	}
	void printData(){
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
	}
}
class Student extends Person{
	int roll,sem;
	String crs;
	void getData(){
                Scanner sc=new Scanner(System.in);
                super.getData();
		System.out.print("Enter your roll: ");
                roll=sc.nextInt();
                System.out.print("Enter your Semester: ");
                sem=sc.nextInt();
                System.out.print("Enter your course: ");
                crs=sc.next(); //Skipping
        }
        void printData(){
		super.printData();
                System.out.println("Roll: "+roll);
                System.out.println("Semester: "+sem);
                System.out.println("Course: "+crs);
        }
}
class Faculty extends Person{
	String maj_sub,pub;
	void getData(){
		Scanner sc=new Scanner(System.in);
		super.getData();
		System.out.print("Enter your major Subject: ");
		maj_sub=sc.nextLine();
		System.out.print("Enter the publication: ");
		pub=sc.nextLine();
	}
	void printData(){
		super.printData();
		System.out.println("Major Subject: "+maj_sub);
		System.out.println("Publication: "+pub);
	}
}
public class A5P3{
	public static void main(String args[]){
		Person p1=new Person();
		Student s1=new Student();
		Faculty f1=new Faculty();
		System.out.println("Enter the Details of the Student: ");
		s1.getData();
		System.out.println("Details of Student is ");
		s1.printData();
		System.out.println("Enter the Details of the Faculty: ");
		f1.getData();
		System.out.println("Details of Faculty is ");
		f1.printData();

	}
}

