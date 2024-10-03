class sample
{
    public void display()
    {
      for(int i=0;i<10;i++)
        System.out.println(i);
    }

    public void display(String name,int age)
    {
       System.out.println("Name:"+name);
       System.out.println("age:"+age);
         if(age>18) 
         {
             System.out.println("you are eligible for vote");
         }
         else
         {
             System.out.println("you are not eligible for vote");
         }
      }
}


class overload4
{
    public static void main(String args[])
    {
      sample obj=new sample();
      obj.display();
      obj.display("Mohammed Eesa",20);
    }
}
      




      