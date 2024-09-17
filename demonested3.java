class sample
{
   sample()
   {
    int salary=18000;
    int age=28;
    int balance=65000;

     if(salary>=15000 && age<=30)
     {
          System.out.println("please check your bank balance");
     
         if(balance>=30000)
         {
            System.out.println("you are bank balnce is above 30000");
            System.out.println("you are eligible for loan");
         }
         else
         {
            System.out.println("you are bank balance is below 30000");
            System.out.println("you are not eligible for loan");
         }
     }
     else
     {
         System.out.println("improve your personal growth");
     }
   }
}

class demonested3
{
   public static void main(String args[])
   {
      new sample();
   }
}