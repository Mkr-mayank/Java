import empPackage.*;
class PermanentEmp extends Employee{
    public void display(){
        super.display();
        System.out.println("Total Salary: "+(basicSal+hra+da));
    }
}
public class A7P5 {
    public static void main(String args[]){
        PermanentEmp e1=new PermanentEmp();
        e1.getData();
        e1.display();
    }
}
