import java.util.*;
public class demo2 {
    // public static void main(String args[]){
    //     // int a,b;
    //     // String k="ff fg";
    //     // for (a=1;a<=10;a++){
    //     //     for (b=1;b<=10;b++){
    //     //         System.out.print(a);
    //     //     }
    //     //     System.out.println();
    //     // }     
    //     // System.out.println(k);
    //     Scanner sc=new Scanner(System.in);
    //     int a,b;
    //     a=sc.nextInt();
    //     System.out.println(a);
    //     b=sc.nextInt();
    //     System.out.println(b);
    //     // for(short i=0;i<=0;i--){
    //         // System.out.println(i);
    //     // }
    //     String str = "ShradhaDidi";
    //     String str1 = "ApnaCollege";
    //     String str2 = "ShradhaDidi";
    //     System.out.println(str.equals(str1) + " " + str.equals(str2));
    //     // String str="ApnaCollege".replace("l","");
    //     // System.out.println(str);
    //     // int bin=1101;
    //     // // String s=Integer.toString(bin);
    //     // int dig=Integer.toString(bin).length()-1;

    // }
    public static int minimumInteger(int N, int[] A) {
        // code here
        int sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            sum+=A[i];
        }
        for(int i=0;i<N;i++){
            if(sum<=N*A[i] && A[i]<=min){
                min=A[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println(minimumInteger(n, A));
    }
}
