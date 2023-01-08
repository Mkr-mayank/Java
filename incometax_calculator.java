import java.util.*;
public class incometax_calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int income;
        float tax;
        System.out.print("Enter your annual income: ");
        income=sc.nextInt();
        if(income<=500000){
            tax=0;
        }
        else if(income>500000 && income<=1000000){
            tax=0.2f*income;
        }
        else{
            tax=0.3f*income;
        }
        System.out.println("Your income tax is: "+tax);
        sc.close();
    }
}
