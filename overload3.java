class sample
{
    sample()
    {
       System.out.println("Hello");
    }
    sample(int x,int y)
    {
       if(x>y)
       {
           System.out.println("X is bigger");
       }
       else
       {
           System.out.println("Y is bigger");
       }
    }
}


class overload3
{
    public static void main(String args[])
    {
       new sample();
       new sample(26,35);
    }
}




