public class largest_string {
    public static void LargestString(String str[]){
        String largest=str[0];
        for(int i=1;i<str.length;i++){
        if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println("Largest string is: "+largest);
    }
    public static void main(String args[]){
        String fruits[]={"apple","mango","banana"};
        LargestString(fruits);
        // String str="apple",str1="Banana",str2="banana";
        // System.out.println(str.compareTo(str1));
        // System.out.println(str.compareTo(str2));
        // System.out.println(str1.compareToIgnoreCase(str2));
    }
}
