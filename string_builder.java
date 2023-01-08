public class string_builder {
    public static void main(String args[]){
        //Using String Builder. Here the time complexity is O(n).
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        //Using String. Here the time Complexity is O(n^2).
        String str="";
        for(char chr='a';chr<='z';chr++){
            str+=chr;
        }
        System.out.println(str);
    }
}
