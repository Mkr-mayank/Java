public class Search_rotated_sorted_array {
    public static int Search(int ar[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(tar==mid){
            return mid;
        }
        if(ar[si]<=ar[mid]){
            if(ar[si]<=tar && tar<=ar[mid]){
                return Search(ar, tar, si, mid-1);
            }
            else{
                return Search(ar,tar,mid+1,ei);
            }
        }
        else{
            if(ar[mid]<=tar && tar<=ar[ei]){
                return Search(ar, tar, mid+1, ei);
            }
            else{
                return Search(ar,tar,si,mid-1);
            }
        }

        

    }    
    public static void main(String args[]){
        int ar[]={4,5,6,7,0,1,2};
        int tar=0;
        System.out.println(Search(ar, tar, 0, ar.length-1));
    }
}
