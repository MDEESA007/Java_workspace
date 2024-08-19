class data 
{
   public void personal_data()
   {
      System.out.println("name="+"eesa");
      System.out.println("age="+"20");
   }
   public void private_data()
   {
      System.out.println("company name="+"infosis");
      System.out.println("locatoin="+"chennai");
   }
}
class mydata
{
  public static void main(String args[])
  {
    data obj=new data();
    obj.personal_data();
    obj.private_data();
  } 
}