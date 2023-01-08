public class Max_subarray_sum_prefixsum {
    public static void MaxSubarraySum(int ar[]){
        int i,j,n=ar.length,currsum;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[n];
        prefix[0]=ar[0];
        for(i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+ar[i];
        }
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                currsum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                // System.out.print(currsum+" ");
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("\nMaximum Subarray sum is "+maxsum);
    }
    public static void main(String args[]){
        int ar[]={-1,6,2,-3,4,-2};
        MaxSubarraySum(ar);
    }
}
