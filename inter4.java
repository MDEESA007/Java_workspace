interface a
{
   public void display();
}

interface b
{
    public void display2();
}

class sample implements a,b
{
    sample(String name,int num,String bank,int acc,String IFSC,String branch,int bal,int dis)
    {
         System.out.println("BANK DETAILS::");
         System.out.println("Name="+name);
         System.out.println("Number="+num);
         System.out.println("Bank Name="+bank);
 	 System.out.println("Acc.No="+acc);
 	 System.out.println("IFSC="+IFSC);
 	 System.out.println("Branch="+branch);
 	 System.out.println("balance="+bal);
      	 System.out.println("location="+dis);
     }


class inter4
{
    public static void main(String asd[])
     {
         new sample();
     }
}