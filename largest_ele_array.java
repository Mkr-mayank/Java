public class largest_ele_array {
    public static int Largest(int ar[]){
        int max=Integer.MIN_VALUE;
        for(int i=1;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }    
    public static void main(String args[]){
        int ar[]={2,6,4,20,1,9,3,5};
        System.out.println("Largest number in the given array is: "+Largest(ar));
    }
}
