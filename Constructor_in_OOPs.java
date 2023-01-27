public class Constructor_in_OOPs {
    public static void main(String args[]){
        Student s1=new Student();
        Student c2=new Student("Mayank");
        Student c3=new Student(19);
        System.out.println(c2.name);
        System.out.println(c3.age);
        s1.name="MS Dhoni";
        s1.roll=7;
        s1.password="asdf";
        s1.marks[0]=99;
        s1.marks[1]=80;
        s1.marks[2]=85;
        Student s2=new Student(s1); //copy
        s2.password="jkl;";
        System.out.println(s2.name);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println();
        s1.marks[2]=78;
        System.out.println(s1.marks[2]);
        System.out.println(s2.marks[2]);
    }
}
class Student{
    String name;
    int age;
    int roll;
    String password;
    int marks[];
    //Non-Parameterized Constructor
    Student(){
        marks=new int[3];
        System.out.println("WE HAVE CREATED A CONSTRUCTOR..");
    }
    //Parameterized Constructor
    Student(String name){
        //marks=new int[3];
        this.name=name;
    }
    //Parameterized Constructor
    Student(int age){
        // marks=new int[3];
        this.age=age;
    }
    //Copy Constructor
        //Shallow Copy Constructor
        // Student(Student s1){
        //     marks=new int[3];
        //     this.name=s1.name;
        //     this.roll=s1.roll;
        //     this.marks=s1.marks;
        // }
        //Deep Copy Constructor
        Student(Student s1){
            marks=new int[3];
            this.name=s1.name;
            this.roll=s1.roll;
            for(int i=0;i<marks.length;i++){
                this.marks[i]=s1.marks[i];
            }
        }
}

