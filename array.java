import java.util.*;
public class array{
    public static void main(String args[]){
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Computer, Maths and English marks: ");
        //Input
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        //Output
        System.out.println("Computer marks: "+marks[0]);
        System.out.println("Maths marks: "+marks[1]);
        System.out.println("English marks: "+marks[2]);
        marks[0]=99;
        System.out.println("Computer marks: "+marks[0]);
        //Length of array marks
        System.out.println(marks.length);
        sc.close();
    }
}