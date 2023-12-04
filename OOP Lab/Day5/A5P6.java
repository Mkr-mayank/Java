class CountObject{
	static int count;
	CountObject(){
		count++;
	}
}
public class A5P6{
	public static void main(String args[]){
		CountObject c1=new CountObject();
		CountObject c2=new CountObject();
		CountObject c3=new CountObject();
		CountObject c4=new CountObject();
		System.out.println("Total number of objects: "+CountObject.count);
	}
}
