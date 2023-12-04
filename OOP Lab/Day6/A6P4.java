interface Vehicle{
	void vehicleType();
}
interface Book{
	void bookType();
}
class MobileBookShopping implements Vehicle, Book{
	public void vehicleType(){
		System.out.println("This vehicle is car");
	}
	public void bookType(){
		System.out.println("These are all Computer Science and Engineering books");
	}
}
public class A6P4{
	public static void main(String args[]){
		MobileBookShopping obj1=new MobileBookShopping();
		obj1.vehicleType();
		obj1.bookType();
	}
}
