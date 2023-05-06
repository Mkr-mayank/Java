public class string_length_recursion {
    public static int StrLength(String str){
        if(str.equals("")){
            return 0;
        }
        return StrLength(str.substring(1))+1;
    }
    public static void main(String args[]){
        String str="Mayank";
        System.out.println(StrLength(str));
    }
}
