import java.lang.System;
import java.util.Scanner;

class sample
{
   sample()
   {   
      Scanner eesa=new Scanner(System.in);
      int mark=eesa.nextInt();

      if(mark<40)
      {
          System.out.println("reappear");
      }
      else if(mark>=40 && mark<50) 
      {
          System.out.println("c grade");
      }
      else if(mark>=50 && mark<65)
      {
          System.out.println("B grade");
      }
      else if(mark>=65 && mark<80)
      {
         System.out.println("A grade");
      }
      else if(mark>=80 && mark<=100)
      {
         System.out.println("O grade");
      }
      else
      {
         System.out.println("enter the correct mark");
      }

   }

}


class demomark
{
   public static void main(String args[])
   {
     new sample();
   }
}