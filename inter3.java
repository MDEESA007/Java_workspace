interface a
{
     int SSLCmark=386;
     int HSCmark=427;
     public void display();
}

interface b 
{
     int balance=65000;
     int salary=18000;
    public void display1();
}

class sample implements a,b
{
    int SSLCmark=386;
    int HSCmark=477;
    int percentage=78;
    int language=3;
         sample()
         {
                 System.out.println("INTERVIEW PROCESS::");

              if (SSLCmark>=350 && HSCmark>=450 && percentage>=70)
              {
                    System.out.println("you will permit the MNC interview");
               }
              else if (SSLCmark>=350 && HSCmark>=450 && percentage>=70 && language>=2)
               {
                     System.out.println("you will get the job");
               }
               else
               {
                    System.out.println("you will not permit the interview"); 
                }
         }


       public void display()
         {
           System.out.println("SCHOLORSHIP DETAILS::");

           if(SSLCmark>=450 && HSCmark>=540)
           {
                 System.out.println("your college fees discount 70%");
           }
           else if(SSLCmark>=400 && HSCmark>=480)
           {
                  System.out.println("your college fees discount 50%");
           }
           else if(SSLCmark>=350 && HSCmark>=420)
           {
                System.out.println("your college fees discount 30%");
           }
           else
           {
                 System.out.println("your college fees no discount");
           }
                System.out.println("");
      }


         public void display1()
          {
             System.out.println("PERSONAL LOAN DETAILS::");

               if(balance>=50000 && salary>=20000)
               {
                      System.out.println("you are eligible for personal loan");
               }
              else
               {
                      System.out.println("you are not eligible for personal loan");
               }
                      System.out.println("");
         }
}
      

class inter3
{
       public static void main(String args[])
       {
            new sample().display();
            new sample().display1();
       }
}
  
