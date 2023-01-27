public class fast_exponent {
    public static int fastexpo(int n,int exp){
        int ans=1;
        while(exp!=0){
            if((exp&1)!=0){
                ans=ans*n;
            }
            n*=n;
            exp=exp>>1;
        }
        return ans;
    }    
    public static void main(String args[]){
        System.out.println(fastexpo(5,5));
    }
}
