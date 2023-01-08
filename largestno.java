import java.util.*;
public class largestno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter two numbers: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1>n2){
            System.out.println("Greatest Number is: "+n1);
        }
        else{
            System.out.println("Greatest Number is: "+n2);
        }
        sc.close();
    }
}
