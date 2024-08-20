class good
{
   public void display()
   {
       System.out.println("welcome");
   }
   good()
   {
       System.out.println("super");
   }
   public void getdata()
   {
       System.out.println("good");
   }
}

class hello
{ 
   public static void main(String args[]) 
   {
      good obj=new good();
      obj.getdata();
      obj.display();
   }
}