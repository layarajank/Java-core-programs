package wrapper;

public class Unboxing
{
	public static void main(String args[])
	{
		Integer a=new Integer(10);
		int i=a.intValue(); // convert integer to int
		int j=i; //unboxing
		System.out.println(a+" "+i+" "+j);
	}
}
	


