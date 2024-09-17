class sample
{
   sample()
   {
      System.out.println("constructor");
   }
   public void getdata(int x)
   {
      System.out.println(x*x);  
   }

}

class demomethod
{
   public static void main(String args[])
   {
     sample obj=new sample();
     obj.getdata(15);

   }
}