import java.util.*;
public class count_lowercase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str;
        int count=0;
        System.out.print("Enter the string ");
        str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("The number of lowercase vowels in the string="+count);
        sc.close();
    }
}
