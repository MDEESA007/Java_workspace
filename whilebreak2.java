class sample
{
   sample()
   {
     int sum=0;
     int number=50;
        
       while(number>=sum)
       {
          sum++;
          if(sum==30)
           break;
       }
      System.out.println("answer:"+sum);  
   }
}

class whilebreak2
{ 
   public static void main(String args[])
   {
     sample obj=new sample();
   }
}