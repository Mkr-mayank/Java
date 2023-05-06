//Count all contiguous substrings starting and ending with the same character.
import java.util.*;
public class count_substring_using_recursion {
    public static int CountContiguousString(String st){
        int n=st.length(),count=0;
        for(int si=0;si<n;si++){
            for(int ei=si;ei<n;ei++){
                if(st.charAt(si)==st.charAt(ei)){
                    count++;
                }
            }
        }
        return count;
    }
    public static int Recursion(String str,int i,int j, int n){
        if(n==1) {
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res=Recursion(str,i+1,j,n-1)+Recursion(str,i,j-1,n-1)-Recursion(str,i+1,j-1,n-2);
        if(str.charAt(i) ==str.charAt(j)) {
            res++;
        }
        return res;

    }
    public static void main(String args[]){
        String st="aba";
        int n=st.length();
        System.out.println(Recursion(st,0,n-1,n));
    }
}
