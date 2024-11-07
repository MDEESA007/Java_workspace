class sample 
{
   String name="Mohammed Eesa";
   String clg="mahendra";
   int age=20;
       sample()
       {
            System.out.println("Name:"+name);  
            System.out.println("Age:"+age); 
            System.out.println("college:"+clg);
       }
         
       public void display()
       {
           String name="muthu";
           String clg="KSR";
           int age=19;
            System.out.println("Name:"+name);  
            System.out.println("Age:"+age); 
            System.out.println("college:"+clg);
        }
}
     

class sample1 extends sample 
{
      sample1()
      {
            System.out.println("Name:"+name);  
            System.out.println("Age:"+age); 
            System.out.println("college:"+clg);
       }
}
  

class inheritance1
{
       public static void main(String args[])
       {
           sample1 obj=new sample1();
           obj.display(); 
       }
}

     