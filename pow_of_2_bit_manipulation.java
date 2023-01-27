public class pow_of_2_bit_manipulation {
    public static boolean ispowoftwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        System.out.println(ispowoftwo(16));

    }
}
