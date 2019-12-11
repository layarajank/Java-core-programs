package oopsconcept;
import java.util.Scanner;
public class Class1 {
	String name,address,phno,email,prooftype,proofid;
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	Class1 a=new Class1();
	System.out.println("Enter your name");
	a.name=s.next();
	System.out.println("Enter your address");
	a.address=s.next();
	System.out.println("Enter your phone number");
	a.phno=s.next();
	System.out.println("Enter your email id");
	a.email=s.next();
	System.out.println("Enter your proof type");
	a.prooftype=s.next();
	System.out.println("Enter your proof id");
	a.proofid=s.next();
	System.out.println("Thank you for Registering.....");
	System.out.println("Name: "+a.name);
	System.out.println("Address: "+a.address);
	System.out.println("Phone Number: "+a.phno);
	System.out.println("Email id: "+a.email);
	System.out.println("Proof Type: "+a.prooftype);
	System.out.println("Proof Id: "+a.proofid);
	}

}
