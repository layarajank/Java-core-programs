package New;
//outer class
public class Inner 
{
	private int a=20;
	//inner class
	class Innerclass
	{
		public void display()
		{
		    System.out.println(a); //acces private variable of outer class
		}
	}
	public static void main(String args[])
	{
	     Inner obj=new Inner(); //creates object for outer class
	     Inner.Innerclass obj2=obj.new Innerclass(); //Creating object for inner class with the reference of outer class
	     obj2.display();
	}

}
