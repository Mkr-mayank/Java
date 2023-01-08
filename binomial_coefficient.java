import java.util.*;
public class binomial_coefficient {
    public static int factorial(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,r;
        float bin_cof;
        System.out.print("Enter the value of n and r: ");
        n=sc.nextInt();
        r=sc.nextInt();
        if(n>=r){
            bin_cof=factorial(n)/(factorial(r)*factorial(n-r));
            System.out.println("The binomial coefficient is: "+bin_cof);
        }
        else{
            System.out.println("Condition for the calculation of Binomial Coefficient is not satisfied or the input is invalid");
        }
        sc.close();
    }
}
