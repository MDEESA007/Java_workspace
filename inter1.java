interface a
{
    String name="eesa";
    int age=20;
    int salary=21600;
    public void eesa();
}
 
interface b
{
     String college="mahendra";
     public void vv();
}

class c implements a,b
{
   public void eesa()
   {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
   }
 
   public void vv()
    {
        System.out.println(college);  
        System.out.println(salary*5);
            
    }
}

class inter1
{
     public static void main(String arsd[])
      {
          new c().eesa();
          new c().vv();
      } 

}