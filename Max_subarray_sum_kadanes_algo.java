public class Max_subarray_sum_kadanes_algo {
    public static void MaxSubarraySum(int ar[]){
        int n=ar.length,i,cs=0,ms=Integer.MIN_VALUE,flag=0;
        for(i=0;i<n;i++){
            if(ar[i]>0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            for(i=0;i<n;i++){
                cs=cs+ar[i];
                if(cs<0){
                    cs=0;
                }
                if(ms<cs){
                    ms=cs;
                }
            }
        }
        else{
            for(i=0;i<n;i++){
                ms=Math.max(ms,ar[i]);
            }
        }
        System.out.println("Maximum Subarray Sum is "+ms);
    }
    public static void main(String args[]){
        int ar[]={-8,-6,-9,-3,-4,-5};
        MaxSubarraySum(ar);
    }
    
}
