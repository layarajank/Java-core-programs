package oppsconcept;
public class Overloading
{
	public void area(int side)
	{
		int area =side*side;
		System.out.println("the area of square is : "+area);
	}
	public void area(int l,int b)
	{
		int area =l*b;
		System.out.println("the area of rectangle is : "+area);
	}
	public void area(float r)
	{
		float area =(float)(3.14*r*r);
		System.out.println("the area of circle is : "+area);
	}
	public void area(float b,float h)
	{
		float area =(float)0.5*b*h;
		System.out.println("the area of Triangle is : "+area);
	}
	public static void  main(String args[])
	{
		Overloading obj=new Overloading();
		System.out.println("\tArea");
		obj.area(5);
		obj.area(3,4);
		obj.area(5.0f);
		obj.area(3.0f,4.0f);
	}
	
	
	

}
