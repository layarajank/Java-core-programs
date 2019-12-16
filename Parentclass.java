package oppsconcept;

public class Parentclass 
{
	public void add()
	{
		int a=10,b=15,c=0;
		c=a+b;
		System.out.println("c: "+c);
	}
		public static void main(String args[])
		{
			Parentclass obj=new Child();
			obj.add();			
		}
}
class Child extends Parentclass
{
	public void add()
	{
		int c=0,a=10,b=5;
		c=a+b+25;
		System.out.println("c: "+c);
	}
	
}
