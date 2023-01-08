public class reverse_array {
    public static void Reverse(int ar[]){
        int len=ar.length,temp;
        for(int i=0;i<len/2;i++){
            temp=ar[i];
            ar[i]=ar[len-i-1];
            ar[len-i-1]=temp;
        }
    }
    public static void main(String args[]){
        int ar[]={3,6,1,8,12,4,7,9};
        Reverse(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }    
}
