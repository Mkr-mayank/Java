public class convert_num_string_recursion {
    static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void Convert(int n){
        if(n==0){
            return;
        }
        int lastdigit= n%10;
        Convert(n/10);
        System.out.print(digit[lastdigit]+" ");

    }
    public static void main(String args[]){
        Convert(1254);
    }
}
