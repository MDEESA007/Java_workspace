class sample
{
   sample()
   {
     for(int i=0;i<10;i++)
      {
        if(i==7)
        continue;
 
        System.out.println(i);
        System.out.println("****");
      }
   }
}


class democonti
{
    public static void main(String args[])
    {
      new sample();
    }
}