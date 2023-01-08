import java.util.*;
public class solid_rhombus_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,sp;
        System.out.print("Enter the number of lines: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(sp=n;sp>i;sp--){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
