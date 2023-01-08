public class Max_subarray_sum_brute_force {
    public static void MaxSubarraySum(int ar[]){
        int i,j,k,n=ar.length,currsum;
        int maxsum=Integer.MIN_VALUE;
        // System.out.println(maxsum);
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                currsum=0;
                for(k=i;k<=j;k++){
                    currsum+=ar[k];
                }
                System.out.print(currsum+" ");
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        // System.out.println();
        System.out.println("\nMaximum Subarray Sum="+maxsum);
    }
    public static void main(String args[]){
        int ar[]={-1,6,2,-3,4,-2};
        MaxSubarraySum(ar);
    }
    
}
