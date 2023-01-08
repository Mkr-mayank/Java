import java.util.*;
public class searching_in_matrix {
    public static boolean SearchinMatrix(int ar[][],int ele){
        int r=ar.length,c=ar[0].length,i,j;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(ar[i][j]==ele){
                    System.out.println("Element found at index: ("+i+", "+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }
    public static void Printmatrix(int ar[][]){
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
        int r=matrix.length,c=matrix[0].length,i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The required matrix is: ");
        Printmatrix(matrix);
        System.out.print("Enter the searching element: ");
        int ele=sc.nextInt();
        SearchinMatrix(matrix,ele);
        sc.close();
    }
}
