interface a
{
    int salary=23000;
    public void eesa();
}
 
interface b extends a
{
     int incentive=5500;
     public void vv();
}

class c implements a,b
{
   public void eesa()
   {
       if(salary>=25000)
       {
            System.out.println("You are eligible for all loan");
       }
       else if(salary+incentive>=20000)
       {
           System.out.println("you are eligible for personal and home loan only"); 
       }
       else
       {
             System.out.println("You are not eligible for loan");
       }
   }
 
   public void vv()
    {
        System.out.println((salary)+incentive);       
    }
}

class inter2
{
     public static void main(String arsd[])
      {
          new c().eesa();
          new c().vv();
      } 

}