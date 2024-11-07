class sample
{
    String name="Eesa";
     int age=20;
       sample()
       {
            System.out.println("Name:"+name);  
            System.out.println("Age:"+age);   
     }
}

class sample1 extends sample
{
       sample1()
       {
            System.out.println("Name:"+name);  
            System.out.println("Age:"+age);   
       }
}

class inheritance
{
      public static void main(String args[])
       {
           sample1 obj=new sample1();
        }
}
            