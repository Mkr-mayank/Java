import java.util.*;
public class sum_of_digits {
    public static int SumofDigit(int n){
        int lastdigit,sum=0;
        while(n>0){
            lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        System.out.println("The sum of digits = "+SumofDigit(n));
        sc.close();
    }
}
