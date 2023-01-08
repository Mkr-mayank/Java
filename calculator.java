import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char operator;
        int a,b;
        System.out.print("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.print("Enter (+) for addition, (-) for subtraction, (*) for multiplication, (/) for division or (%) for modulo: ");
        operator=sc.next().charAt(0);
        switch(operator){
            case '+': System.out.println(a+b);
                break;
            case '-': System.out.println(a-b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '/': System.out.println(a/b);
                break;
            case '%': System.out.println(a%b);
                break;
            default: System.out.println("This calculator is not so advanced or the operator is invalid");
        }
        sc.close();
    }
}
