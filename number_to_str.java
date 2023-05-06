public class number_to_str {
    static String st[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void NumToStr(int n){
        if(n==0){
            return;
        }
        int r=n%10;
        NumToStr(n/10);
        System.out.print(st[r]+" ");
    }
    public static void main(String args[]){
        int n=1943;
        NumToStr(n);
    }    
}
