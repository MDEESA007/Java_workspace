class simple
{ 
   simple()
   {
     System.out.println("constructor");
   }
   public void display()
   {
     System.out.println("method");
   }
}

class demoeesa
{
  public static void main(String args[])
  {
    simple obj=new simple();
    obj.display();
  }
}