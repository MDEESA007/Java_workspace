class sample
{
       sample(int a,int b,int c)
	{
             System.out.println(a*b*c);
	     System.out.println(a*+b+c);
	     this.display();
	}
  
        public void display()
 	{
            System.out.println("Hii,Mohmmed Eesa");
 	}
   }

class sample1 extends sample
{
	sample1(int x,int y,int z)
	{
             super(10,10,10);
             System.out.println(x+y+z);
        }
}

class super3
{
	public static void main(String args[])
	{
	     sample1 obj=new sample1(10,12,20);
	}
}