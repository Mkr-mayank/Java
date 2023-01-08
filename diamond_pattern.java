import java.util.*;
public class diamond_pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,sp;
        System.out.print("Enter the number of lines: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(sp=1;sp<=(n-i);sp++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(sp=1;sp<=(n-i);sp++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}