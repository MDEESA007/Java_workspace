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

class sample2 extends sample1
{
       sample2()
       {
            System.out.println("Name:"+name);  
            System.out.println("Age:"+age);   
       }
}

class inheritance3
{
      public static void main(String args[])
       {
           sample2 obj=new sample2();
       }
}
            