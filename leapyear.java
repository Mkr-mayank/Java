import java.util.*;
public class leapyear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int yr;
        System.out.print("Enter a year: ");
        yr=sc.nextInt();
        if(yr%4==0){
            if(yr%100!=0){
                System.out.println(yr+" is a Leap year");
            }
            else if(yr%100==0){
                if(yr%400==0){
                    System.out.println(yr+" is a Leap Year");
                }
                else{
                    System.out.println(yr+" is not a Leap Year");
                }
            }
        }
        else{
            System.out.println(yr+" is not a Leap Year");
        }
        sc.close();
    }
}
