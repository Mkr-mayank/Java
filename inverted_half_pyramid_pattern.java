import java.util.*;
public class inverted_half_pyramid_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter the number of lines: ");
        n=sc.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
