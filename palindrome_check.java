import java.util.*;
public class palindrome_check {
    public static int Reverse(int n){
        int lastdigit,rev=0;
        while(n>0){
            lastdigit=n%10;
            rev=rev*10+lastdigit;
            n=n/10;
        }
        return rev;
    }
    public static boolean IsPalindrome(int num){
        int rev=Reverse(num);
        if(num==rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        System.out.println(n+" is a Palindrome number "+IsPalindrome(n));
        sc.close();
    }
}
