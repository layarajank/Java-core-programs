package New;

abstract class class1
{
	abstract void display();	
}
public class anonymous 
{
public static void main(String args[])
{
	class1 obj=new class1() 
	{
		
		void display()
		{
			System.out.println("anonymous class");
		}
	};
	obj.display();
	
}
}
