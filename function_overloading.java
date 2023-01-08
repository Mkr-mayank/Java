public class function_overloading {
    //Function Overloading using Parameters
    public static int multiply(int a,int b){
        return(a*b);
    }
    public static float multiply(float a,float b){
        return(a*b);
    }
    public static float multiply(int a, float b){
        return(a*b);
    }
    //Function Overloading using Data Types
    public static int add(int a,int b){
        return(a+b);
    }
    public static int add(int a,int b,int c){
        return(a+b+c);
    }
    public static float add(float a, int b,int c,int d){
        return(a+b+c+d);
    }
    public static void main(String args[]){
        float a=3.5f;
        int b=2,c=4,d=5;
        System.out.println(multiply(b,c));
        System.out.println(add(a,b,c,d));
    }
}
