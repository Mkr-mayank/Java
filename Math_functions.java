public class Math_functions {
    public static void main(String args[]){
        int a=6,b=4,c=9;
        //Square root of c i.e. 9
        System.out.println(Math.sqrt(c));
        //a raise to 3
        System.out.println(Math.pow(a,3));
        //Maximum among a and b
        System.out.println(Math.max(a,b));
        //Minimum among a and b
        System.out.println(Math.min(a,b));
        //Absolute value of -3.15 or you can say Modulus of -3.15 which returns 3.15
        System.out.println(Math.abs(-3.15));
        //This function returns a random number of double data type >= 0.0 and < 1.0.
        System.out.println(Math.random());
        //This function round off the decimal number to nearest value .
        //Ex- number is 7.43 then it will round off to 7.
        //If its decimal value is greater than 0.4 then it round off next integer value.
        //Ex- 7.5 then it will round off to 8.
        System.out.println(Math.round(3.5));
        //Returns the cube root of a number.
        System.out.println(Math.cbrt(27));
        //Returns -1 if the number is negative and 1 if the number is positive.
        System.out.println(Math.signum(45));

    }   
}
