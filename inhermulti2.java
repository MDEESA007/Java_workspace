class sample1
{
    String name="welcome to i18n solution";
    int age=10;

         sample1(String name,int age)
         {
             System.out.println(name);
             System.out.println(age);
         }
        sample1()
         {
              this("mohammed eesa",20);
         }
}

class sample2 extends sample1
{
         sample2(String name,int age)
         {  
              System.out.println(name);
              System.out.println(age);
         }
}

class sample3 extends sample2
{
         sample3(int x,int y,int z)
         {
                super("vignesh",21);
                System.out.println(x*y);
                System.out.println(x+y+z);
         }
}

class sample4 extends sample3
{
         sample4(int a,int b,int c)
         {
             super(3,5,2);
             System.out.println(a+b+c);
            System.out.println(a*b*c);
         }
}


class inhermulti2
{
        public static void main(String args[])
        {
              sample4 obj=new sample4(20,50,75);
         }
}

                  