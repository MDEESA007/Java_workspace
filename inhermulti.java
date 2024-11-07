class sample
 {
   sample()
	{
	  System.out.println("Inside sample");
	}

    public void display1()
	{
	  System.out.println("Inside method,eesa");
          this.display2();
	}
 
    public void display2()
	{
	  System.out.println("Inside method,java");
	}
 }

class sample1 extends sample
 {
   sample1()
	{
	  System.out.println("Inside sample1");
	}
 }

class sample2 extends sample1
 {
   sample2()
	{
	  System.out.println("Inside sample2");
	}
 }

class inhermulti
 {
    public static void main(String  args[])
	{
	   sample2 obj=new sample2();	
	   obj.display1();
	}
 }
      