class sample
{
    public void display()
    {
       System.out.println("Mohammed Eesa");
    }
  
    public void display(int x)
    {
       System.out.println(x*x);
    }
    public void display(int x,int y)
    {
       System.out.println(x+y);
    }
}

class overload1
{
   public static void main(String args[])
   {
     sample obj=new sample();
      obj.display();
      obj.display(12);
      obj.display(67,58);
   }
}