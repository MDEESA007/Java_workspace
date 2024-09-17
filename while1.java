class sample
{
   sample()
   {
      int a=1;
      int sum=0;
  
        while(a<=10)     
        {
           sum=sum+a;
           a++;
        
           System.out.println("answer:"+sum);
        }
    }
}

class while1
{
   public static void main(String args[])
   {
     sample obj=new sample();
   }
}