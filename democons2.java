class samp
{
   samp()
   {
      System.out.println("democons");
   }
   public void display()
   {
      System.out.println("demomethod");
   }
} 


class democons2
{
  public static void main(String args[])
  {
    samp obj1=new samp();
    samp obj2=new samp();
    obj1.display();
  }
}