import java.util.Scanner;
class sample
{
    String name;
    int num;
    private int dis; 
    Scanner eesa=new Scanner(System.in);
     int amount=eesa.nextInt();

        sample()
        {
            System.out.println("CUSTOMER DETAILS;;");
            System.out.println("  ");
            name="Mohammed Eesa";
            num=876056678;
            System.out.println(name);
            System.out.println(num);
            System.out.println(amount);
         }
        public void display()
        {
            System.out.println("you will puschase above 20000 you will get 12%discount");
            int dis=(amount*12)/100;
            System.out.println("discount amount="+dis);
            int net=(amount-dis);
            System.out.println("selling amount="+net);
        }
}

class sample1 extends sample
{
        sample1()
        {
            name="vignesh";
            num=996593541;
            System.out.println(name);
            System.out.println(num);
            System.out.println(amount);
        }
}



class private1
{
     public static void main(String aa[])
     {
        sample obj=new sample1();
         obj.display(); 
     }
}      