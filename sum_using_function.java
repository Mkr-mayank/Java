import java.util.*;
public class sum_using_function {
    public static void Addition(int a,int b){
        int sum=a+b;
        System.out.println("The sum is : "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Addition(x,y);
        sc.close();
    }
}
