import java.util.*;
public class hollow_rhombus_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,sp;
        System.out.print("Enter the number of lines: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(sp=1;sp<=(n-i);sp++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                //My Logic
                // if(i==1 || i==n){
                //     System.out.print("*");
                // }
                // else if((i>1 && (j==1 || j==n))||(i<n && (j==1 || j==n))){
                //     System.out.print("*");
                // }
                // else{
                //     System.out.print(" ");
                // }
                //Logic 2
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
