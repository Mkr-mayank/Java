package Theory;
import java.util.*;
public class TMarks {
    public double marksTMath,marksTPhy,marksTChe;
    public void getMarks(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Theory marks in Maths, Physics and Chemistry: ");
        marksTMath=sc.nextDouble();
        marksTPhy=sc.nextDouble();
        marksTChe=sc.nextDouble();
    }

}
