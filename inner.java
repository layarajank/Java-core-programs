package New;

public class inner {
	private int a=20;
	class innerclass
	{
		public void display()
		{
		System.out.println(a);
		}
	}
	public static void main(String args[])
	{
	inner obj=new inner();
	inner.innerclass obj2=obj.new innerclass();
	obj2.display();
	}

}
