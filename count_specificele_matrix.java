public class count_specificele_matrix {
    public static void count_specific_element_in_matrix(int ar[][],int ele){
        int count=0,row,col;
        for(row=0;row<ar.length;row++){
            for(col=0;col<ar[0].length;col++){
                if(ar[row][col]==ele){
                    count++;
                }
            }
        }
        System.out.println(ele+" appeared "+count+" times in the matrix");
    }
    public static void main(String args[]){
        int matrix[][]={{2,5,1,6},
                        {7,3,6,10},
                        {12,4,7,1},
                        {6,8,15,7}};
        count_specific_element_in_matrix(matrix, 20);
    }
}
