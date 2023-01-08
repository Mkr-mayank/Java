import java.util.*;
public class hollow_rectangle_pattern {
    public static void HollowRectangle(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.print("Enter the number of rows and columns: ");
        row=sc.nextInt();
        col=sc.nextInt();
        HollowRectangle(row, col);
        sc.close();
    }
}
