class eesa
{
   public void eesa()
   {
      System.out.println("name"+"eesa");
      System.out.println("age"+"20");
   }
   public void display()
   {
      System.out.println("company"+"eesa");
      System.out.println("location"+"salem");
   }
}

class eesa1
{
   public static void main(String args[])
   {
      eesa obj=new eesa();
      obj.display();
      obj.eesa();
   }
}
