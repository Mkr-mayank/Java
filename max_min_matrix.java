import java.util.*;
public class max_min_matrix {
    public static void MaxMinMatrix(int ar[][]){
        int i,j,r=ar.length,c=ar[0].length,large=Integer.MIN_VALUE,small=Integer.MAX_VALUE;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                large=Math.max(large,ar[i][j]);
                small=Math.min(small,ar[i][j]);
            }
        }
        System.out.println("Largest and smallest elements are "+large+" and "+small+" respectively.");
    }
    public static void CreateMatrix(int ar[][]){
        int i,j,r=ar.length,c=ar[0].length;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                ar[i][j]=sc.nextInt();
            }
        }
    }
    public static void PrintMatrix(int ar[][]){
        int i,j,r=ar.length,c=ar[0].length;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        CreateMatrix(matrix);
        PrintMatrix(matrix);
        MaxMinMatrix(matrix);
        
    }
}
