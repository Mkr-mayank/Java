public class counting_sort {
    public static void Counting_Sort(int ar[]){
        int i,n=ar.length,largest=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            largest=Math.max(ar[i],largest);
        }
        int count[]=new int[largest+1];
        for(i=0;i<ar.length;i++){
            count[ar[i]]++;
        }
        int j=0;
        for(i=0;i<count.length;i++){
            while(count[i]>0){
                ar[j]=i;
                j++;                            
                count[i]--;
            }
        }
        for(i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        int ar[]={2,1,5,3,1,8,7,3,4};
        Counting_Sort(ar);
    }
    
}
