import java.util.*;
abstract class Account{
	double Balance;
	long accountNumber;
	String accountHolderName;
	String address;
	Account(double Balance, int accountNumber, String accountHolderName, String address){
		this.Balance=Balance;
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.address=address;
	}
	abstract void withdrawal();
	abstract void deposit();
	void display(){
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Balance: "+Balance);
	}
}
class SavingAccount extends Account{
	double amount;
	SavingAccount(double Balance, int accountNumber, String accountHolderName, String address){
		super(Balance,accountNumber,accountHolderName, address);
	}
	void withdrawal(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		amount=sc.nextDouble();
		if(amount<=super.Balance){
			super.Balance=super.Balance-amount;
			System.out.println(amount+" is debited from your account");
		}
		else{
			System.out.println("Your account has insufficient balance.");
		}
	}
	void deposit(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount to deposit: ");
		amount=sc.nextDouble();
		super.Balance=super.Balance+amount;
		System.out.println("Your account is credited by Rs. "+amount);
	}
	void display(){
		super.display();
	}
}
public class A6P3{
	public static void main(String args[]){
		SavingAccount s1=new SavingAccount(40000.0,987601,"Sudip Ghosh","Kharagpur");
		s1.display();
		s1.withdrawal();
		s1.display();
	}
}
