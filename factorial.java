import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,fac=1;
        System.out.print("Enter the number whose factorial you want to calculate: ");
        n=sc.nextInt();
        for(int i=n;i>=1;i--){
            fac=fac*i;
        }
        System.out.println("Factorial of "+n+" is "+fac);
        sc.close();
    }
}
