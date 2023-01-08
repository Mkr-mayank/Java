import java.util.*;
public class skip_on_10 {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter a number: ");
            n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }
    }
}
