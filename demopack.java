import pack.client2;
import java.util.Scanner;
class student extends client2
{
      student()
      {
          Scanner eesa=new Scanner(System.in);
          int mark=eesa.nextInt();
          String name=eesa.nextLine();
       }
}
class demopack1
{
      public static void main(String args[])
      {
          new student();
     }
}    
           