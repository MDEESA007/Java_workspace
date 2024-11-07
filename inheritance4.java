class sample
{
   int percentage;
   int assignment;
   int attendance;
   int SSLCmark;
   int HSCmark;
   String bankname;
   int accno;
   int balance;
   int salary;
   int num;
   int language;

      sample()
      {
         
          SSLCmark=386;
          HSCmark=427;
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
}
   
class sample1 extends sample
{
    balance=65000;
    salary=18000;
        sample1()
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

class sample2 extends sample1
{
    SSLCmark=386;
    HSCmark=477;
    percentage=78;
         sample2()
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
}


class inheritance4
{
       public static void main(String args)
       {
            sample2 obj=new sample2();
       }
}