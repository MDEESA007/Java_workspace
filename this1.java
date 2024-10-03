class sample
{
  String name,city,clg;
  int age;
  
    sample(String name,int age,String city,String clg)
    {
      this.name=name;
      this.age=age;
      this.city=city;
      this.clg=clg;

       System.out.println("name="+name);
       System.out.println("age="+age);
       System.out.println("city="+city);
       System.out.println("College="+clg);
    }
    public void display()
    {
       System.out.println("name="+name);
       System.out.println("age="+age);
       System.out.println("city="+city);
       System.out.println("College="+clg);
    }
 
}


class this1
{
    public static void main(String args[])
    {
      sample obj=new sample("eesa",20,"salem","mahendra");
      obj.display();
    }
}