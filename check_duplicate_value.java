public class check_duplicate_value {
    public static boolean Duplicate(int ar[]){
        int i,j;
        //Time Complexity O(n^2) i.e., Brute Force
        for(i=0;i<ar.length;i++){
            for(j=i+1;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int ar[]={2,3,5,1,8};
        System.out.println("Is Duplicate element found? "+Duplicate(ar));
    }
}
