import java.util.*;
public class prime_bw_range {
    public static boolean Prime_check(int n){
        int i=2;
        while(i<=Math.sqrt(n)){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void Prime_range(int n){
        int num;
        for(num=2;num<=n;num++){
            if(Prime_check(num)){
                System.out.print(num+" ");
            }  
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the last term: ");
        n=sc.nextInt();
        Prime_range(n);
        sc.close();
    }
}