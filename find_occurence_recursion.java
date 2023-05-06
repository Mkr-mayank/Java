public class find_occurence_recursion{
    public static void CountOccur(int ar[],int i,int ele){
        if(i==ar.length){
            return;
        }
        if(ar[i]==ele){
            System.out.print(i+" ");
        }
        CountOccur(ar, i+1, ele);
    }
    public static void main(String args[]){
        int ar[]={2,5,8,3,5,1,8,8,8,9,11,1};
        CountOccur(ar, 0, 8);
    }
}