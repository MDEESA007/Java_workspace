class variable
{
  variable()
  {
     for(int i=0;i<15;i++)
     System.out.println(i);
  }
  public void display()
  {
     for(int m=15;m<50;m++)
     System.out.println(m);
  }
}


class constructor
{
  public static void main(String args[])
  {  
     variable obj=new variable();
     obj.display();
  }
}