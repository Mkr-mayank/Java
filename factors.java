import java.util.*;
public class factors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i=2;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        System.out.print("Factors of the given number are: ");
        while(i<n){
            if(n%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
        sc.close();
    }
}
