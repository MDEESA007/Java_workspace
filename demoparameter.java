class student
{
   public void display(String name,int age,String location)
   {
    System.out.println("name="+name); 
    System.out.println("age="+age);
    System.out.println("location="+location);
   }
}

class demoparameter
{
   public static void main(String args[])
   {
      student obj=new student();
      obj.display("eesa",19,"salem");
   }
}