class student
{
  String name,city,clg;
  int age
  
    sample(String name,int age,String city,String clg)
    {
       System.out.println("name="+name);
       System.out.println("age="+age);
       System.out.println("city="+city);
       System.out.println("College="+clg);
    }
}


class this
{
    public static void main(String args[])
    {
      sample obj=new sample("eesa",20,"salem","mahendra");
    }
}