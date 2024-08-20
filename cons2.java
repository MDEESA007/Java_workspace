class simple 
{ 
   simple()
   {
      System.out.println("good morning"); 
   }
   public void getdata()
   { 
      System.out.println("good evening");
   }
   public void display()
   { 
      System.out.println("good night");
   }
}

class cons2
{
   public static void main(String args[]) 
   {
      simple obj1=new simple();
      obj1.getdata();
      obj1.display();
   }
}