class sample
{
     sample(int x,int y,String name)
     {
         System.out.println(x*y*x);
         System.out.println(x+y+x+y);
         System.out.println(name);
     }
}


class sample1 extends sample
{
      sample1(String name,int age,String clg,String dist,int regnum)
      {
          Super(10,15,"welcome to i18n solution");
          System.out.println(name);
          System.out.println(age);
          System.out.println(clg);
          System.out.println(dist);
         System.out.println(regnum);
      }
}


class inhermulti3 
{
      public static void main(String args[])
      {
          sample1 obj=new sample1("Mohammed eesa",20,"Mahendra Engineering college","salem",222071062);
      }
}
       