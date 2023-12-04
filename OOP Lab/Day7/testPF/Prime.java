package testPF;
public class Prime {
    public void CheckPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is a Prime number");
        }
        else{
            System.out.println(n+" is not a Prime number");
        }
    }
}
