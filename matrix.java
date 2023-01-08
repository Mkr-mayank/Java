import java.util.*;
public class matrix {
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int r=matrix.length,c=matrix[0].length,i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
