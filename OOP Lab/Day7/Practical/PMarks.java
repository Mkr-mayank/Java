package Practical;
import java.util.Scanner;
public class PMarks {
    public double marksPMath,marksPPhy,marksPChe;
    public void getMarks(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Practical marks in Maths, Physics and Chemistry: ");
        marksPMath=sc.nextDouble();
        marksPPhy=sc.nextDouble();
        marksPChe=sc.nextDouble();

    }
}
