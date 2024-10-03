class sample
{
 int salary;
 int year;
 int increment;   
    sample()
    {
       salary=10000;
       year=2;
       increment=1000;
        while(25>year)
        {         
          salary=salary+increment;
          System.out.println(year+"year salary");        
          System.out.println("salary amount:"+salary);
          year++;
        }
    }
}

class global5
{
   public static void main(String args[])
   {
     new sample();
   }
}

