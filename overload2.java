class sample
{
    sample()
    {
       System.out.println("Mohammed Eesa");
    }
  
    sample(int x)
    {
       System.out.println(x*x);
    }
    sample(int x,int y)
    {
       System.out.println(x+y);
    }
}

class overload2
{
   public static void main(String args[])
   {
     sample obj=new sample();
      new sample(15);
      new sample(27,36);
   }
}