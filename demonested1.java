class sample
{
   sample()
   { 
     int mark=80;
     
     if(mark>=65)
     { 
        System.out.println("pass");
        
         if(mark>=65)
         {         
             System.out.println("you have a 1st class degree");
         }
         else
         {
             System.out.println("you have a 2nd class degree");
         }
     }
     else
     {
         System.out.println("reappear");
     }
   }
}



class demonested1
{
    public static void main(String args[])
    {
       new sample();
    }
}

