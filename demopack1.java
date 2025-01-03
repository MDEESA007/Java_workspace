import pack.client2;
import java.util.Scanner;
class student extends client2
{
      student(String name)
      {
         super(name);
       }
}
class demopack1
{
      public static void main(String args[])
      {
         Scanner eesa=new Scanner(System.in);
          String name=eesa.nextLine();
         student obj= new student(name);
   
     }
}    
           