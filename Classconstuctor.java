package oopsconcept;
import java.util.Scanner;

public class Classconstuctor {
	public String name,address,phno,email,prooftype,proofid;
	Classconstuctor(String name,String address,String phno,String email,String prooftype,String proofid)
	{
		this.name=name;
		this.address=address;
		this.phno=phno;
		this.email=email;
		this.prooftype=prooftype;
		this.proofid=proofid;
	}
	
	void display()
	{
	System.out.println("Thank you for Registering.....");
	System.out.println("Name: "+name);
	System.out.println("Address: "+address);
	System.out.println("Phone Number: "+phno);
	System.out.println("Email id: "+email);
	System.out.println("Proof Type: "+prooftype);
	System.out.println("Proof Id: "+proofid);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your address");
		String address=s.next();
		System.out.println("Enter your phone number");
		String phno=s.next();
		System.out.println("Enter your email id");
		String email=s.next();
		System.out.println("Enter your proof type");
		String prooftype=s.next();
		System.out.println("Enter your proof id");
		String proofid=s.next();
		Classconstuctor a=new Classconstuctor(name,address,phno,email,prooftype,proofid);
		a.display();
	}
}
