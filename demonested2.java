class sample
{
   sample()
   {
     int att=65;

     if(att>=65)
     {
         System.out.println("you will permit to exam");
         
         if(att>=80)
         {
            System.out.println("you have a extra 5 marks");
         }
         else
         {
            System.out.println("you have a extra 2 marks");
         }
     }
     else
     {
        System.out.println("you will not permit to exam");  
     }
   }
}


class demonested2
{
    public static void main (String args[])
    {
      new sample();
    }

}


