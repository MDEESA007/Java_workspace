class sample
{
      sample(int a,int b)
      {
          System.out.println(a*b);
       }
}

class sample1 extends sample 
{      
       sample1(int x,int y,int z)
       {
            super(18,20);
            System.out.println(x+y+z);
       }
}


class super2
{
       public static void main(String args[])
       {
          sample1 obj= new sample1(18,20,28);
       }
}

   
             