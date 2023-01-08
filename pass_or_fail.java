import java.util.*;
public class pass_or_fail {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.print("Enter your percentage: ");
        marks=sc.nextInt();
        String st=(marks>=33)?"Pass":"Fail";
        System.out.println(st);
        sc.close();
    }
}
