import java.util.*;
public class sum_odd_even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,num,sodd=0,seven=0;
        System.out.print("How many integers do you want to enter: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter number "+i+": ");
            num=sc.nextInt();
            if(num%2==0){
                seven=seven+num;
            }
            else{
                sodd=sodd+num;
            }
        }
        System.out.println("The sum of given even numbers is: "+seven);
        System.out.println("The sum of given odd numbers is: "+sodd);
        sc.close();
    }
}
