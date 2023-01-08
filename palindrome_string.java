public class palindrome_string {
    public static boolean PalindromeCheck(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("String is not Palindrome");
                return false;
            }
        }
        System.out.println("String is Palindrome");
        return true;
    }
    public static void main(String args[]){
        String st="racecar";
        PalindromeCheck(st);
    }
}
