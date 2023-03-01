//Print all binary strings of size N without consecutive ones.
public class binary_String_recursion {
    public static void PrntBinStr(int n, int lstplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        PrntBinStr(n-1,0,str+"0");
        if(lstplace==0){
            PrntBinStr(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
        PrntBinStr(2, 0, "");
    }
}
