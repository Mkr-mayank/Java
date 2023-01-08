import java.util.*;
public class sum_of_n {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=1,n,sum=0;
        System.out.print("Enter the last term: ");
        n=sc.nextInt();
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);
        sc.close();
    }
}
