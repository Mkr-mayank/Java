import java.util.*;
public class factorial_using_fn {
    public static void factorial(int n){
        int fac=1,i=1;
        if(n>=0){
            while(i<=n){
                fac=fac*i;
                i++;
            }
        }
        else{
            int k=n;
            while(k<=-1){
                fac=fac*k;
                k++;
            }
        }
        System.out.print("Factorial is: "+fac);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        factorial(num);
        sc.close();
    }
}
