class sample
{
       sample()
       {  
           this(27,28);
           System.out.println("Hii I am constructor");
       }

      sample(int x,int y)
      {
           System.out.println(x+y);
      }

     public void display1()
     {
          System.out.println("Hii I am method");
          this.display2();
      }

      public void display2()
      {
          System.out.println("Hii I am eesa");
      }
}


class this3
{
      public static void main(String args[])
      {
          sample obj=new sample();
         obj.display1();      
      }
}	