
public class array_rotation_from_pivot {
    public static int Target_Index(int ar[],int low,int high,int target){
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(ar[mid]==target){
                return mid;
            }
            else if(ar[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int minSearch(int ar[]){
        int low=0, high=ar.length-1,mid;
        while(low<high){
            mid=(low+high)/2;
            if(mid>0 && ar[mid-1]>ar[mid]){
                return mid;
            }
            else if(ar[mid]>ar[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static int Search(int ar[], int target){
        int min=minSearch(ar);
        if(ar[min]<=target && target<=ar[ar.length-1]){
            return(Target_Index(ar, min, ar.length-1,target));
        }
        else{
            return(Target_Index(ar, 0,min-1, target));
        }
    }
    public static void main(String args[]){
        int ar[]={-9,-7,-6,-3,-11,-10};
        int target=-9;
        System.out.println("Index is "+Search(ar,target));
    }
}
