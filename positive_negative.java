import java.util.*;
public class positive_negative {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        num=sc.nextInt();
        if(num>=0){
            System.out.println(num+" is a positive integer");
        }
        else{
            System.out.println(num+" is a negative integer");
        }
        sc.close();
    }
}
