public class Merge_Sort {
    public static void MergeSort(int ar[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        MergeSort(ar, si, mid);
        MergeSort(ar, mid+1, ei);
        Merge(ar,si,mid,ei);
    }
    public static void Merge(int ar[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(ar[i]<ar[j]){
                temp[k]=ar[i];
                i++;
            }
            else{
                temp[k]=ar[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=ar[i++];
        }
        while(j<=ei){
            temp[k++]=ar[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            ar[i]=temp[k];
        }
    }
    public static void PrintArray(int ar[],int n){
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int ar[]={6,3,9,5,2,8};
        int n=ar.length;
        PrintArray(ar, n);
        MergeSort(ar, 0, n-1);
        PrintArray(ar, n);
    }
}
