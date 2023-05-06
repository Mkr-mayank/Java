public class Quick_Sort {
    public static void QuickSort(int ar[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pi=Partition(ar,si,ei);
        QuickSort(ar,si,pi-1);
        QuickSort(ar,pi+1,ei);
    }    
    public static int Partition(int ar[],int si,int ei){
        int pivot=ar[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(ar[j]<=pivot){
                i++;
                int temp=ar[j];
                ar[j]=ar[i];
                ar[i]=temp;
            }
            
        }
        i++;
        int temp=pivot;
        ar[ei]=ar[i];
        ar[i]=temp;
        return i;
    }
    public static void PrintArray(int ar[],int n){
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int ar[]={6,3,9,8,2,5};
        int n=ar.length;
        PrintArray(ar, n);
        QuickSort(ar, 0,n-1);
        PrintArray(ar, n);
    }
}
