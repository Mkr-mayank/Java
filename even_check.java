import java.util.*;
public class even_check {
    public static boolean isEven(int n){
        if(n%2==0){
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
        System.out.println(n+" is even. "+isEven(n));
        sc.close();
    }
}
