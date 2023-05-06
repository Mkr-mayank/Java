public class friends_pair_recursion {
    public static int Friend_Pair(int n){
        if(n==1||n==2){
            return n;
        }
        int tways=Friend_Pair(n-1)+(n-1)*Friend_Pair(n-2);
        return tways;
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(Friend_Pair(n));
    }
}
