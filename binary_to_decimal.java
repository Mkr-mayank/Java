import java.util.*;
public class binary_to_decimal {
    public static void BintoDec(int n){
         int dec=0,pow=0,lastdigit,bin=n;
        while(n>0){
            lastdigit=n%10;
            n=n/10;
            dec=dec+lastdigit*(int)Math.pow(2,pow);
            pow++;
        }
        System.out.println("The decimal number of "+bin+" is "+dec);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a binary number: ");
        n=sc.nextInt();
        BintoDec(n);
        sc.close();
    }
    
}
