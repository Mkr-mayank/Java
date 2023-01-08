public class String_Compression {
    //My method
    public static void Compress1(String str){
        StringBuilder sb=new StringBuilder("");
        int count=1,i;
        for(i=1;i<str.length();i++){
            if(str.charAt(i-1)==str.charAt(i)){
                count++;
            }
            else{
                sb.append(str.charAt(i-1));
                if(count>1){
                    sb.append(count);
                }
                count=1;
            }
        }
        sb.append(str.charAt(i-1));
        if(count>1){
            sb.append(count);
        }
        
        System.out.println(sb);
    }
    //Method 2
    public static void Compress2(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && (str.charAt(i)==str.charAt(i+1))){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
    public static void main(String args[]){
        String str="aaabbccddd";
        Compress2(str);
    }
}
