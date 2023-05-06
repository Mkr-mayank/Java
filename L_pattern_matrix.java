import java.util.*;
public class L_pattern_matrix {
    public static void LMatrix(int ar[][]){
        int i,j;
        int startrow=0,endrow=ar.length-1,startcol=0,endcol=ar[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //left
            for(i=startrow;i<=endrow;i++){
                System.out.print(ar[i][startcol]+" ");
            }
            //bottom
            for(j=startcol+1;j<=endcol;j++){
                System.out.print(ar[endrow][j]+" ");
            }
            System.out.println();
            startcol++;
            endrow--;
        }
    }
    public static void Creatematrix(int ar[][]){
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
        System.out.println();
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // Creatematrix(matrix);
        PrintMatrix(matrix);
        LMatrix(matrix);
        // PrintMatrix(matrix);

    }
}
