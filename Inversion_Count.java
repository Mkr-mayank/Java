public class Inversion_Count {
    public static void Invcount(int ar[],int n){
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]>ar[j] && i<j){
                    count++;
                }
            }
        }
        System.out.println("Inversion count is "+count);
    }
    public static void main(String args[]){
        int ar[]={2,4,1,3,5};
        int n=ar.length;
        Invcount(ar, n);
    }

}
