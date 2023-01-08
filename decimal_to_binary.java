import java.util.*;
public class decimal_to_binary {
    public static void DectoBin(int n){
        int bin=0,lastdigit,pow=0,dec=n;
        while(n>0){
            lastdigit=n%2;
            n=n/2;
            bin=bin+lastdigit*(int)Math.pow(10,pow);
            pow++;
        }
        System.out.println("The binary number of "+dec+" = "+bin);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the decimal number: ");
        n=sc.nextInt();
        DectoBin(n);
        sc.close();
    }
}
