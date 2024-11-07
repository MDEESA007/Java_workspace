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


      sample(int salary,int balance)
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
          

       sample(String bankname,int accno,int salary,int balance,int num)
       {
          System.out.println("BANK ACCOUNT DETAILS::");
          System.out.println("Bankname:"+bankname);
          System.out.println("Account Number:"+accno);
          System.out.println("salary:"+salary);             
          System.out.println("saving Balance:"+balance);    
          System.out.println("Mobile Number:"+num);
          System.out.println("");
       }


       sample(int SSLCmark,int HSCmark,int percentage,int language)
       {
        System.out.println("INTERVIEW PROCESS::");

         if(SSLCmark>=350 && HSCmark>=390 && percentage>=70)
          {
            System.out.println("you will permit the MNC interview");
          }
          else if(SSLCmark>=350 && HSCmark>=390 && percentage>=70 && language>=2)
          {
            System.out.println("you will get the job");
          }
          else
          {
            System.out.println("you are not permit MNC interview");
          }
       }
}
            
       

class demoload1
{
    public static void main(String args[])
    {
      sample obj=new sample();
      new sample(65000,18000);
      new sample("Canara Bank",1275648374,22000,65000,876056667);
      new sample(371,410,82,3);
    }
}

        

        
 
        