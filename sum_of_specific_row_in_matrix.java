public class sum_of_specific_row_in_matrix {
    public static void Row_Element_Sum(int ar[][]){
        int i,sum=0;
        for(i=0;i<ar[0].length;i++){
            sum+=ar[1][i];
        }
        System.out.println("The sum of second row elements of the matrix is: "+sum);
    }    
    public static void main(String args[]){
        int matrix[][]={{2,6,1,9},
                        {8,4,3,10},
                        {5,3,2,6},
                        {10,12,9,15}};
        Row_Element_Sum(matrix);
    }
}
