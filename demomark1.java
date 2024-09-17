import java.lang.System;
import java.util.Scanner;

class sample
{
   sample()
   {
      Scanner eesa=new Scanner(System.in);
      int amount=eesa.nextInt();
    
      if(amount<1000)
      {
          System.out.println("no discount");
      }
      else if( amount>=1000 && amount<=2500) 
      {
          System.out.println("you will purchase 1000 to 2500 you will get 2% discount");
          int dis=(amount*2)/100;
          System.out.println("discount amount="+dis);
          int net=(amount-dis);
          System.out.println(" offer price="+net);
      }
      else if( amount>2500 && amount<4000)
      {
          System.out.println("you will purchase 2501 to 3999 you will get 4% discount");
          int dis=(amount*4)/100;
          System.out.println("discount amount="+dis);
          int net=(amount-dis);
          System.out.println(" offer price="+net);
    
      }
      else if( amount>=4000 && amount<6000)
      {
         System.out.println("you will purchase 4000 to 5999 you will get 5% discount");
         int dis=(amount*5)/100;
         System.out.println("discount amount="+dis);
         int net=(amount-dis);
         System.out.println(" offer price="+net);
    

      }
      else if( amount>=6000 && amount<10000)
      {
         System.out.println("you will purchase 6000 to 9999 you will get 6% discount");
         int dis=(amount*6)/100;
         System.out.println("discount amount="+dis);
         int net=(amount-dis);
         System.out.println(" offer price="+net);
    

      }
      else if(amount>=10000 && amount<=15000)
      {
         System.out.println("you will purchase 10000 to 15000 you will get 8% discount");
         int dis=(amount*8)/100;
         System.out.println("discount amount="+dis);
         int net=(amount-dis);
         System.out.println(" offer price="+net);
      }
      else
      {
         System.out.println("you will purchase above 15000 you will get 10% discount");
         int dis=(amount*10)/100;
         System.out.println("discount amount="+dis);
         int net=(amount-dis);
         System.out.println(" offer price="+net);
      }

   }

}


class demomark1
{
   public static void main(String args[])
   {
     new sample();
   }
}