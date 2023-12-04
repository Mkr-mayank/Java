import Theory.*;
import Practical.*;
import java.util.*;
class Student{
    int rollNo;
    String name;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.print("Enter your Roll No: ");
        rollNo=sc.nextInt();
        TMarks t1=new TMarks();
        PMarks p1=new PMarks();
        t1.getMarks();
        p1.getMarks();
        double totalTmarks,totalPmarks,grandtotal,percentage;
        String Grade;
        totalTmarks=t1.marksTMath+t1.marksTPhy+t1.marksTChe;
        totalPmarks=p1.marksPMath+p1.marksPPhy+p1.marksPChe;
        grandtotal=totalTmarks+totalPmarks;
        percentage=grandtotal/6;
        if(percentage>=90 && percentage<=100){
            Grade="O";
        }
        else if(percentage>=80 && percentage<90){
            Grade="E";
        }
        else if(percentage>=70 && percentage<80){
            Grade="A";
        }
        else if(percentage>=60 && percentage<70){
            Grade="Pass Class";
        }
        else{
            Grade="FAIL";
        }
        System.out.println("Your Grade is "+Grade);
    
    }
}
public class A7P3 {
    public static void main(String args[]){
        Student s1=new Student();
        s1.getdata();
    }
}
