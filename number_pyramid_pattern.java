import java.util.*;
public class number_pyramid_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,sp;
        System.out.print("Enter the number of lines: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(sp=i;sp<n;sp++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
