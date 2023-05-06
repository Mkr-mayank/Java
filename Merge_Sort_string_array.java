import java.util.*;
public class Merge_Sort_string_array {
    public static String[] MergeSort(String ar[],int si,int ei){
        if(si==ei){
            String A[]={ar[si]};
            return A;
        }
        int mid=si+(ei-si)/2;
        String ar1[]=MergeSort(ar,si,mid);
        String ar2[]=MergeSort(ar,mid+1,ei);
        String ar3[]=Merge(ar1,ar2);
        return ar3;
    }
    public static String[] Merge(String ar1[],String ar2[]){
        int m=ar1.length;
        int n=ar2.length;
        String ar3[]=new String[m+n];
        int idx=0,i=0,j=0;
        while(i<m && j<n){
            if(isAlphabeticallySmaller(ar1[i],ar2[j])){
                ar3[idx++]=ar1[i++];
            }
            else{
                ar3[idx++]=ar2[j++];
            }
        }
        while(i<m){
            ar3[idx++]=ar1[i++];
        }
        while(j<n){
            ar3[idx++]=ar2[j++];
        }
        return ar3;
    }
    
    public static boolean isAlphabeticallySmaller(String st1,String st2){
        if(st1.compareTo(st2)<0){
            return true;
        }
        return false;
    }
    public static void PrintStringArray(String ar[],int n){
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+' ');
        }
        System.out.println();
    }
    public static void main(String args[]){
        String ar[]={"mayank","raunak","play"};
        int n=ar.length;
        String a[]=MergeSort(ar, 0, n-1);
        PrintStringArray(a, n);
    }
}
