package oppsconcept;

public class Overriding 
{
	public static void main(String args[])
	{
		Parent obj =new Childclass();
		obj.add(10,5);
	}
}
class Parent 
{
	public void add(int a,int b)
	{
      int c=a+b;
      System.out.println(c);
	}
}
class Childclass extends Parent
{
	public void add(int a,int b)
	{
      int c=a+b;
      System.out.println(c);
	}
}


