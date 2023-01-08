import java.util.*;
public class prime_number_check {
    //Optimised condition for checking a prime number which is upto n^(1/2)
    public static boolean Prime(int n){
        if(n==2){
            return true;
        }
        else{
            int i=2;
            while(i<=Math.sqrt(n)){
                if(n%i==0){
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        if(Prime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
