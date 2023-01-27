public class modular_exponentiation {
    public static int modularExpo(int n,int exp,int x){
        int ans=1;
        while(exp!=0){
            if((exp&1)!=0){
                ans=ans*n;
            }
            n=n*n;
            exp=exp>>1;
        }
        return (ans%x);
    }
    public static void main(String args[]){
        System.out.println(modularExpo(3,5,2));
    }
}
