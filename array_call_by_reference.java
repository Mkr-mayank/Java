public class array_call_by_reference {
    public static void Update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]++;
        }
    }
    public static void main(String args[]){
        int marks[]={92,97,95};
        Update(marks);
        //Call by Reference
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" "); //Original marks of array is updated by 1     
        }
    }
    
}
