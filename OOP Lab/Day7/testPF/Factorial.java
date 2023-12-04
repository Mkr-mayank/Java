package testPF;
public class Factorial {
    int n, fac=1;
    public void CalculateFactorial(int n){
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        System.out.println("The Factorial of "+n+" is "+fac);
    }
}
