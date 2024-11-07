class sample
{
      sample(String name)
      {
          System.out.println(name);
       }
}

class sample1 extends sample 
{      
       sample1()
       {
            super("mohammed eesa");
            System.out.println("child class");
       }
}


class super
{
       public static void main(String args[])
       {
          sample1 obj= new sample1();
       }
}

   
             