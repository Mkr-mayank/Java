import java.util.*;
public class reverse_a_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,r,rev=0;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        int a=n;
        while(n>0){
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        System.out.print("The reverse of "+a+" is "+rev);
        sc.close();
    }
}
