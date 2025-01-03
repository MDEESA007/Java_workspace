class sample
{
    int x=10;
    static int y=50;

      public void display()
      {
          System.out.println(x);       
          System.out.println(y);   
            y++; 
      }
     
     static public void display1()
      {
             System.out.println(y); 
      }
}

class static1
{  
     public static void main(String asd[])
     {
         sample obj=new sample();
         obj.display();
         sample obj2=new sample();
          obj2.display();
     }
}