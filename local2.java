class sample
{
   sample(String name,int age,String degree,String dept)
   { 
     System.out.println("Name:"+name);
     System.out.println("Age:"+age);
     System.out.println("Degree:"+degree);
     System.out.println("Dept:"+dept);
     
   }
}


class local2
{
    public static void main(String args[])
    {
      sample obj=new sample("eesa",19,"B.Tech","IT");
      sample obj2=new sample("Salman",20,"BE","CSE");
    }
}