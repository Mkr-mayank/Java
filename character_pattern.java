import java.util.*;
public class character_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        char ch='A';
        System.out.print("Enter the number of lines: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
