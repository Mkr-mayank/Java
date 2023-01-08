import java.util.*;
public class binary_searching {
    public static int binary_Search(int ar[],int ele){
        int high=ar.length-1,low=0,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(ar[mid]==ele){
                return mid;
            }
            else if(ar[mid]<ele){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ele,index;
        int ar[]={3,6,7,12,15,21,34};
        System.out.print("Enter the searching element: ");
        ele=sc.nextInt();
        index=binary_Search(ar, ele);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+index);
        }
        sc.close();
    }
}
