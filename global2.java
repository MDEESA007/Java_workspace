class sample
{
   String name;
   String college;
   int rollnum;

     sample()
     {
       name="eesa";
       college="mahendra";
       rollnum=222071062;
       System.out.println("name="+name);
       System.out.println("college="+college);
       System.out.println("Roll Number="+rollnum);

     }

     public void display()
     {
       name="salman";
       college="sona";
       rollnum=222071063;
       System.out.println("name="+name);
       System.out.println("college="+college);
       System.out.println("Roll Number="+rollnum);
     }
}

class global2
{
    public static void main(String args[])
    {
     sample obj= new sample();
     obj.display();
    }
}