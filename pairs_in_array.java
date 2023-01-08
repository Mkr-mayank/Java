public class pairs_in_array {
    public static void printPairs(int ar[]){
        int n=ar.length,curr,tpairs=0;
        for(int i=0;i<n;i++){
            curr=ar[i];
            for(int j=i+1;j<n;j++){
                System.out.print("("+curr+","+ar[j]+") ");
                tpairs++;
            }
            System.out.println();
        }
        System.out.println("Number of pairs= "+tpairs);
    }
    public static void main(String args[]){
        int ar[]={2,5,7,1,4,9};
        printPairs(ar);
    }
    
}
