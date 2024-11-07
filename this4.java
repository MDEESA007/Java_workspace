class sample
{
     public void display1() 
     {
       System.out.println("hello friends");     
       this.display2();
       this.display3();
      }

      public void display2()
      {
        System.out.println("welcome");                                                     
      }
   
      public void display3()
      {
         System.out.println("super");
      }
}


class this4
{
     public static void main(String args[])
     {
          sample obj= new sample();
          obj.display1();
      }
}