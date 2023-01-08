// import java.util.*;
class demo{
    public static int callbyvalue(int a){
        a=a+5;
        return a;
    }
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the length of square pattern: ");
        // int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        int n=2;
        callbyvalue(n);
        System.out.println(n);
        // sc.close();
        // int x=2077;
        // String str="Java";
        // System.out.println(x+str);
        // int x=Integer.MIN_VALUE+Integer.MAX_VALUE;
        // System.out.println(x);
        // // String str1="Owl";
        // String str2="City";
        // System.out.println("Before swapping: str1="+ str1 + "and str2="+str2);
        // str1=str1+str2;
        // str2=str1.substring(0,str1.length()-str2.length());
        // str1=str1.substring(str2.length());
        // System.out.println("After swapping: str1 ="+ str1 +"and str2 ="+ str2);    
    }
}