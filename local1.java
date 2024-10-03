class sample
{
   sample(String name,int age,String college,String degree,String dept)
   {
     System.out.println("Name:"+name);
     System.out.println("Age:"+age);
     System.out.println("College:"+college);
     System.out.println("Degree:"+degree);
     System.out.println("Dept:"+dept);

   }
}


class local1
{
    public static void main(String args[])
    {
      sample obj=new sample("eesa",19,"Mahendra","B.Tech","IT");
    }
}