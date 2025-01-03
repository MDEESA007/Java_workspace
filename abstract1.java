abstract class sample
{
	sample()
	{
            System.out.println("base class constructor");
            System.out.println("         ");
	}

	abstract public void display1(int a);
        abstract public void display2(int b);
        abstract public void display3(int c);
}

class sample1 extends sample
{
	sample1()
	{
            System.out.println("derived class constructor");
             System.out.println("         ");
	}
	
	public void display1(int a)
	{
           System.out.println("first method");
           System.out.println(a*a*a);
           System.out.println("         ");
	}

	public void display2(int b)
	{
           System.out.println("second method");
           System.out.println(b*b*b);
           System.out.println("         ");
         }

	public void display3(int c)
	{
           System.out.println("third method");
           System.out.println(c*c*c);
           System.out.println("         ");
	}
}
 
class abstract1
{
      public static void main(String args[])
       {
           sample1 obj=new sample1();
           obj.display1(10);
           obj.display2(15);
           obj.display3(20);
        }
}