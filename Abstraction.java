import java.util.*;
public class Abstraction {
    public static void main(String args[]){
        Mustang new_horse=new Mustang();
        // Animal->Horse->Mustang\
        // Queen q1=new Queen();
        // q1.moves();
    }
}
//Abstract Class
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
    void eat(){
        System.out.println("Eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor is called");
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
    void Changecolor(){
        color="Dark Brown";
        System.out.println(color);
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor is called");
    }
}
class Penguin extends Animal{
    void walk(){
        System.out.println("Walks on 3 legs");
    }
    void Changecolor(){
        color="Black & White";
    }
}
//Interface
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up/Down/Left/Right/Diagonal in all four direction");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up/Down/Left/Right");
    }
}
