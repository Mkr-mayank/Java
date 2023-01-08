public class Staircase_Search_in_Matrix {
    public static boolean StaircaseSearch(int ar[][],int key){
        //when top right element is considered as starting point
        // int row=0,col=ar[0].length-1;
        // while(row<ar.length && col>=0){
        //     if(key==ar[row][col]){
        //         System.out.println("Element found at index ("+row+", "+col+")");
        //         return true;
        //     }
        //     else if(key>ar[row][col]){
        //         row++;
        //     }
        //     else{
        //         col--;
        //     }
        // }
        
        //when bottom left element is considered as starting point
        int row=ar.length-1,col=0;
        while(row>=0 && col<=ar[0].length-1){
            if(ar[row][col]==key){
                System.out.println("Element found at index ("+row+", "+col+")");
                return true;
            }
            else if(key<ar[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
       System.out.println("Element not found"); 
       return false;
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        StaircaseSearch(matrix,48);
    }
}
