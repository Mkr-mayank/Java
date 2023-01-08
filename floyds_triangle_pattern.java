import java.util.*;
public class floyds_triangle_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,st=1;
        System.out.print("Enter the number of lines: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(st<10){
                    System.out.print(st+"   ");
                }
                else if(st>=10 && st<100){
                    System.out.print(st+"  ");
                }
                else{
                    System.out.print(st+" ");
                }
                st++;
            }
            System.out.println();
        }
        sc.close();
    }
}
