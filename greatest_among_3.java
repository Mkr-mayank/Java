import java.util.*;
public class greatest_among_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c,max;
        System.out.print("Enter three numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            max=a;
        }
        else if(a>b && a<c){
            max=c;
        }
        else if(b>a && b>c){
            max=b;
        }
        else{
            max=c;
        }
        System.out.println("The greatest number is: "+max);
        sc.close();
    }
}
