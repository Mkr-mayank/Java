import java.util.*;
public class area {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float rad=sc.nextFloat();
        float arc=3.14f*rad*rad;
        System.out.println("Area of circle is : "+arc);
        int side=sc.nextInt();
        float ar=(side)*(side);
        System.out.println(ar+" "+arc);
        sc.close();
    }
}
