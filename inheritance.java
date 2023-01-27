public class inheritance {
    public static void main(String args[]){
        //Single Level Inheritance
            // Fish shark=new Fish();
            // shark.eat();
        //Multi Level Inheritance
            // Dog Tommy=new Dog();
            // Tommy.colour="Black";
            // Tommy.breathe();
            // Tommy.legs=4;
            // Tommy.barks();
            // System.out.println(Tommy.legs);
        //Hierarchial Inheritance
            // Bird Sparrow=new Bird();
            // Sparrow.eat();
            // Sparrow.fly();
            // Human Kamlesh=new Human();
            // Kamlesh.breathe();
            // Kamlesh.walk();
        //Hybrid Inheritance
            Lion l1=new Lion();
            l1.breathe();
            l1.carnivorous();
            l1.jungle();
            Wild Elephant=new Wild();
            Elephant.colour="Grey";
            System.out.println(Elephant.colour);
            Elephant.jungle();
            Domestic Cat=new Domestic();
            Cat.eat();
            Cat.pet();
            Rabbit r1=new Rabbit();
            r1.herbivorous();
            r1.pet();


    }
    
}
//Parent class/Base class
class Animal{
    String colour;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }

}
//Derived class/Child class/Subclass
//Single Level Inheritance
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
//Multi Level Inheritance
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
    void barks(){
        System.out.println("Barks");
    }
}
//Hierarchial Inheritance
class Human extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
//Hybrid Inheritance
class Wild extends Animal{
    void jungle(){
        System.out.println("Lives in Jungle");
    }
}
class Lion extends Wild{
    void carnivorous(){
        System.out.println("Eats flesh");
    }
}
class Domestic extends Animal{
    void pet(){
        System.out.println("Safe to keep at home");
    }
}
class Rabbit extends Domestic{
    void herbivorous(){
        System.out.println("Eats plants extracted food");
    }
}

