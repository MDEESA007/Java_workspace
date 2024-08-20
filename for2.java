class eesa
{
   eesa()
   {
     for(int i=0;i<50;i++)
     System.out.println(i);
   }
   public void display()
   {
     for(int i=50;i<70;i++)
     System.out.println(i);
   }
}

class for2
{
   public static void main(String args[])
   {
      eesa obj=new eesa();
      obj.display();
   }
}