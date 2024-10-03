import java.util.Scanner;
class sample
{
   String name;
   int accno;
   int num;  
   String bankname;
   String branch;
   int currbal;
   int minibal;
   int salary;
   
   sample()
   {
     name="Mohammed Eesa";
     accno=1219128769;
     num=876056667;
     bankname="Canara Bank";
     branch="Suramangalam";
     currbal=12500;
     minibal=1500;
   
     System.out.println("Name="+name);
     System.out.println("Account Number="+accno);
     System.out.println("Mobile Number="+num);
     System.out.println("Bank Name="+bankname);
     System.out.println("Branch="+branch);
     System.out.println("Current Balance="+currbal);
     System.out.println("Minimum Balance="+minibal);
    }
   
     
     public void display()
     {
        Scanner eesa=new Scanner(System.in);
        System.out.print("Enter your Bank Balance=");
        currbal=eesa.nextInt();
        System.out.print("Enter your Bank Balance=");
        salary=eesa.nextInt();
      
       if(salary>15000 && currbal>10000)
       {
          System.out.println("you are eligible for loan");
       }
       else
       {
           System.out.println("you are not eligible for loan");
       }
     }

}

class global4
{
    public static void main(String args[])
    {
      sample obj=new sample();
      obj.display();
    }
}








