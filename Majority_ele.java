public class Majority_ele {
    public static int Majority(int ar[],int n){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,ar[i]);
        }
        int count[]=new int[mx+1];
        for(int i=0;i<mx+1;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            if(count[ar[i]]==0){
                count[ar[i]]=1;
            }
            else if(count[ar[i]]!=0){
                count[ar[i]]++;
            }
        }
        int major=0;
        for(int i=1;i<=mx;i++){
            if(count[i]>n/2){
                major=i;
            }
        }
        return major;
    }
    public static void main(String args[]){
        int ar[]={4,4,1,4,7,4,4,5,1,4};
        int n=ar.length;
        System.out.println(Majority(ar,n));
    }
}
