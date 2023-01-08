import java.util.*;
public class odd_even_using_bits {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);    
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        if((n&1)==0){
            System.out.println("Even");
        }    
        else{
            System.out.println("Odd");
        }
    }
}