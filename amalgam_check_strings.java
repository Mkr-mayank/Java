import java.util.*;
public class amalgam_check_strings {
    public static boolean Amalgam1(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                int flag=0;
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }    
    public static boolean Amalgam2(String str1,String str2){
        //First we will convert both the strings either in Uppercase or in Lowercase.
        //Why? So that we don't have to check separately for Uppercase and Lowercase.  
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray(); 
        //First check whether the length of both strings are same or not
        if(str1.length()==str2.length()){
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result=Arrays.equals(ch1,ch2);
            if(result){
                System.out.println(str1+" and "+str2+" are amalgams of each other");
                return true;
            }
            else{
                System.out.println(str1+" and "+str2+" are not amalgams of each other");
                return false;
            }
        }
        else{
            System.out.println(str1+" and "+str2+" are not amalgams of each other");
            return false;
        }
    }
    public static void main(String args[]){
        String str1="Race",str2="care";
        System.out.println(Amalgam2(str1,str2));
    }
}
