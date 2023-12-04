package empPackage;
import java.util.*;
public class Employee {
    public int id;
    public String name;
    public double basicSal,da,hra;
    public void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee name: ");
        name=sc.nextLine();
        System.out.print("Enter Employee ID: ");
        id=sc.nextInt();
        System.out.print("Enter the basic Salary: ");
        basicSal=sc.nextDouble();
        System.out.print("Enter the DA: ");
        da=sc.nextDouble();
        System.out.print("Enter the HRA: ");
        hra=sc.nextDouble();
    }
    public void display(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Basic Salary: "+basicSal);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
    }
}
