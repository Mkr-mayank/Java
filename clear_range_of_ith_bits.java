public class clear_range_of_ith_bits{
    public static void main(String args[]){
        int bitmask,a,b,i=2,j=7,n=2515;
        a=(~0)<<(j+1);
        b=(1<<i)-1;
        bitmask=a|b;
        System.out.println(bitmask&n);
    }
}