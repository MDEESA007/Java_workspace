class sample
{
   String name;
   String college;
   int rollnum;

     sample()
     {
       name="hanifa";
       college="knowledge";
       rollnum=123061107;
       System.out.println("name="+name);
       System.out.println("college="+college);
       System.out.println("Roll Number="+rollnum);

     }

     public void display()
     {
       name="aslam";
       college="SRM";
       rollnum=222071061;
       System.out.println("name="+name);
       System.out.println("college="+college);
       System.out.println("Roll Number="+rollnum);
     }
}

class global3
{
    public static void main(String args[])
    {
     sample obj= new sample();
     obj.display();
    }
}