import java.util.*;
public class multiplication_table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        sc.close();
    }
}
