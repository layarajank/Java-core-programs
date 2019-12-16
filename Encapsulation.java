package oopsconcept;

import java.util.Scanner;

public class Encapsulation {
	String name,address,phno,email,prooftype,proofid; //member variables
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
	   GetSetclass r=new GetSetclass();        //creates object for GetSetclass
	   //calling setter functions from GetSetclass using the object 
	   r.setname(name);
	   r.setaddress(address);
	   r.setphno(phno);
	   r.setemail(email);
	   r.setprooftype(prooftype);
	   r.setproofid(proofid);
	   //calling getter functions from GetSetclass using the object
	   System.out.println("Thank you for Registering.....");
	   System.out.println("Name: "+r.getname(name));
	   System.out.println("Address: "+r.getaddress(address));
	   System.out.println("Phone Number: "+r.getphno(phno));
	   System.out.println("Email id: "+r.getemail(email));
	   System.out.println("Proof Type: "+r.getprooftype(prooftype));
	   System.out.println("Proof Id: "+r.getproofid(proofid));
	   s.close();
	}
	

}
