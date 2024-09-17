class details
{
   public void getdata(String bank,int account,int balance,String branch,int withdraw)
   {
      System.out.println("bank name="+bank);
      System.out.println("account number="+account);
      System.out.println("balance="+balance);
      System.out.println("branch name="+branch);
      System.out.println("withdraw="+withdraw);
      System.out.println(balance-withdraw);
   }
}
  
 
class bank
{
  public static void main(String args[])
  {
     details obj=new details(); 
     obj.getdata("canara",1219120012,10000,"suramangalam",2500); 
  }
}