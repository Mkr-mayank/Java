public class OOPs {
    public static void main(String args[]){
        // Pen p1=new Pen(); //Create new object called p1
        // p1.setColour("Blue");
        // System.out.println(p1.colour);
        // p1.setTip(6);
        // System.out.println(p1.tip);
        // BankAccount ac1=new BankAccount();
        // ac1.username="Mayank128";
        // // ac1.password="Mydateofbirth"; //We don't have access to change the password as it is private.
        // ac1.SetPassword("29Feb2002"); //Here we can set the password.
        // System.out.println(ac1.username); //As the username is public, we can modify it & print it.
        // // System.out.println(ac1.password); //We don't have access to print password.
        Car c1=new Car();
        c1.setSpeed(40);
        c1.setMileage(21);
        System.out.println(c1.getSpeed());
        System.out.println(c1.getMileage());
    }
}
// Implementation of Class and Object
class Pen{
    String colour;
    int tip;
    void setColour(String newColour){
        colour=newColour;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
// //Access Modifiers
// class BankAccount{
//     public String username;
//     private String password;
//     public void SetPassword(String pwd){
//         password=pwd;
//     }
// }
//Getters and Setters
class Car{
    private int speed;
    private int mileage;
    //Getter
    public int getSpeed() {
        return this.speed;
    }
    public int getMileage(){
        return this.mileage;
    }
    //Setter
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setMileage(int mileage){
        this.mileage=mileage;
    }

}