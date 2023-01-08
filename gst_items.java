import java.util.*;
public class gst_items {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pen, pencil, eraser;
        System.out.print("Enter the price of pen, pencil and eraser: ");
        pen=sc.nextFloat();
        pencil=sc.nextFloat();
        eraser=sc.nextFloat();
        float sum=pen+pencil+eraser;
        float gst=(0.18f*sum) +sum;
        System.out.println("Total bill without tax is: "+sum);
        System.out.println("Total bill after adding 18% gst is: "+gst);
        sc.close();
    }
}
