class sample
{
  String college="mahendra";
  int km;
  String hii;

     sample(String name,int age,String degree,String dept)
     {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Degree:"+degree);
        System.out.println("Dept:"+dept);
     }
   
     public void display()
     {
       System.out.println("College Name="+college);
     }

     public void getdata()
     {
        System.out.println("Distance="+km);
        System.out.println("roll no="+hii);
     }
}

class global1
{
    public static void main(String args[])
    {
      sample obj1=new sample("eesa",19,"B.Tech","IT");
      sample obj2=new sample("Salman",20,"BE","CSE");
      obj1.getdata();
      obj2.display();
    }
}