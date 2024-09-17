class sample
{
   sample()
   {
     int age=20;
     int weight=65;

      if(age>=18)
       {
          if(weight>50)
          {
             System.out.println("you are eligible to donate blood");
          }
          else
          {
             System.out.println("you are not eligible for donate blood");
          }
       }
      else
       {
         System.out.println("age must be greater than 18");
       }
    }
}


class demonested4
{
   public static void main(String args[])
   {
      new sample();
   }
}
  