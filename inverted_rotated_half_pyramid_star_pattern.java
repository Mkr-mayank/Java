import java.util.*;
public class inverted_rotated_half_pyramid_star_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sp,i,j,n;
        System.out.print("Enter the number of lines: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
