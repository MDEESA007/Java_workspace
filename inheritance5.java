class sample
{
  int a=1;
  int sum=0;
   
      sample()
      {
             while(a<=15)
              {
               sum=sum+a;
                a++;
            System.out.println(sum);
                }
             System.out.println("       ");       
      }
}

class sample1 extends sample
 {
    
       sample1()
       {
            a=0;
            while(a<=10)
             {
                  a++;
                   System.out.println(a);
              }
             System.out.println("       ");
        }
}
     
class sample2 extends sample1
{
         sample2()
         {
                for(int i=0;i<=10;i++)
                 {
                   if(i==8)
                   break;
                System.out.println(i);
                  }
                System.out.println("       ");
          }
}

class sample3 extends sample2
{
       sample3()
       {
              for(int i=0;i<=10;i++)
              {
                 if(i==7)
                 continue;
                System.out.println(i);
               }
         }
}

class inheritance5
{
     public static void main(String args[])
      {
	  sample3 obj=new sample3();
       }
}